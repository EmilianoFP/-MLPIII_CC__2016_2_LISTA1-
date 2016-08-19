package ListadeExercicios1;

public class Carro {

	private String cor;
	private String modelo;
	private int velAtual;
	private int velMaxima;
	
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public int getVelAtual() {
		return velAtual;
	}
	public void setVelAtual(int velAtual) {
		this.velAtual = velAtual;
	}
	public int getVelMaxima() {
		return velMaxima;
	}
	public void setVelMaxima(int velMaxima) {
		this.velMaxima = velMaxima;
	}
		
	public String getLigarFerrari(){
		return "Carro Ligado com Sucesso";
	}
	
	public boolean getAcelerar(int acelerar){
		velAtual += acelerar;
		if (velAtual <= velMaxima){
			System.out.println("\nTeste Finalizado, carro funcionando corretamente.");
			return false;
		}else{
			System.out.println("\nVelocidade Máxima excedida, levar carro para o setor de engenharia!!!!");
			return true;
		}
	}
	
}
