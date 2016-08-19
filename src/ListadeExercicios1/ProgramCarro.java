package ListadeExercicios1;
import java.util.Scanner;
public class ProgramCarro {

	public static void main(String[] args){
	
	Scanner sc= new Scanner(System.in);	
		
	Carro ferrari = new Carro();
	
	System.out.println("Digite o Modelo da Ferrari:");
	ferrari.setModelo(sc.nextLine());
	
	System.out.println("Digite a Cor: ");
	ferrari.setCor(sc.nextLine());
	
	System.out.println("Digite a Velocidade Máxima do modelo: ");
	ferrari.setVelMaxima(sc.nextInt());
	
	System.out.println("Iniciando Teste da Ferrari " + ferrari.getModelo()
						+ " de cor " + ferrari.getCor() + ":");
	
	System.out.println("" + ferrari.getLigarFerrari());
	
	System.out.println("Velocidade Atual: " + ferrari.getVelAtual() + "km/h");
	
	System.out.println("\nDigite até quantos km/h você deseja acelerar: ");
	
	ferrari.getAcelerar(sc.nextInt());	
	
	sc.close();
	}
	
}
