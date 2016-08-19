package ListadeExercicios1;
import java.util.Scanner;
public class ProgramFatura {

	public static void main (String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		Fatura fatura = new Fatura();
		
		System.out.println("Digite o Numero da Fatura: ");
		fatura.setNumero(sc.nextLine());
		
		System.out.println("\nDigite a Descricao do Produto: ");
		fatura.setDescricao(sc.nextLine());
		
		System.out.println("\nDigite o Preco do Produto");
		fatura.setPreco(sc.nextDouble());
		
		System.out.println("\nDigite a quantidade do Produto informado: ");
		fatura.setQuantidade(sc.nextInt());
		
		
		System.out.println("\nNumero da Fatura: " + fatura.getNumero());
		System.out.println("Descricao: " + fatura.getDescricao());
		System.out.println("Preco do Produto: " + fatura.getPreco());
		System.out.println("Quantidade do Produto: " + fatura.getQuantidade());
		System.out.println("\nValor Final: " + fatura.getValorFatura(-1));
		
		sc.close();
		
	}
	
}
