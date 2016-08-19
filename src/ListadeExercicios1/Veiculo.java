package ListadeExercicios1;

import java.util.Scanner;

public class Veiculo {

	private String placa;
	private String marca;
	private String modelo;
	private int ano;
	private double valorKmRodado;
	private double KmInicial;
	private double valorDaLocacao;
	private String chassi;
	private Pessoa proprietario;
	private double KmFinal;

	Scanner leitor = new Scanner(System.in);

	public double getKmFinal() {
		return KmFinal;
	}

	public void setKmFinal(double kmFinal) {
		KmFinal = kmFinal;
		System.out.print("Digite o Km Final: ");
		KmFinal = leitor.nextDouble();

	}


	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		System.out.print("Digite a marca do carro: ");
		marca = leitor.nextLine();
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		System.out.print("Digite o modelo do carro: ");
		modelo = leitor.nextLine();
		this.modelo = modelo;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
		System.out.print("Digite o ano do carro: ");
		ano = leitor.nextInt();
	}

	public double getValorKmRodado() {
		return valorKmRodado;
	}

	public void setValorKmRodado(double valorKmRodado) {
		this.valorKmRodado = valorKmRodado;
		System.out.print("Digite o valor do Kmm rodado: ");
		valorKmRodado = leitor.nextDouble();
	}

	public double getKmInicial() {
		return KmInicial;
	}

	public void setKmInicial(double kmInicial) {
		KmInicial = kmInicial;
		System.out.print("Digite o Km Inicial: ");
		KmInicial = leitor.nextDouble();
	}

	public double getValorDaLocacao() {
		return valorDaLocacao;
	}

	public void setValorDaLocacao(double valorDaLocacao) {
		this.valorDaLocacao = valorDaLocacao;
		System.out.print("Digite o valor da locação: ");
		valorDaLocacao = leitor.nextDouble();
		this.valorDaLocacao = this.valorDaLocacao + (this.getKmInicial()-this.KmFinal);
		System.out.print(getValorDaLocacao());
	}

	public String getChassi() {
		return chassi;
	}

	public void setChassi(String chassi) {
		this.chassi = chassi;
		System.out.print("Digite o chassi do carro: ");
		chassi = leitor.nextLine();
	}

	public Pessoa getProprietario() {
		return proprietario;
	}

	public void setProprietario(Pessoa proprietario) {
		this.proprietario = proprietario;
	}	
	

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
		System.out.print("Digite a placa: ");
		placa = leitor.nextLine();
	}

	public void locacao() {

		Veiculo veiculo = new Veiculo();
		veiculo.setMarca(getMarca());
		veiculo.setModelo(getModelo());
		veiculo.setChassi(getChassi());
		veiculo.setAno(getAno());			
		veiculo.setKmInicial(getKmInicial());
		veiculo.setKmFinal(getKmFinal());
		veiculo.setValorKmRodado(getValorKmRodado());
		veiculo.setValorDaLocacao(getValorDaLocacao());
		veiculo.setProprietario(getProprietario());
		veiculo.setPlaca(getPlaca());		
		
	}
	
}