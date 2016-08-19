package ListadeExercicios1;

import java.util.Scanner;

public class ProgramLocadora {

	public static void main (String[] args){
		
		Locadora loc = new Locadora();
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("-----Locadora PowerFilmes-----");
		System.out.println("\nInforme o título do Filme: ");
		loc.setTitulo(sc.nextLine());
		
		
		
		System.out.println("\nInforme o tipo de filme: ");
		System.out.println("1 - Lancamento");
		System.out.println("2 - Infantil");
		loc.setCategoria(sc.nextInt());
		
		loc.getAutor();
		
		System.out.println("Nome do Filme: " + loc.getTitulo());
		
		System.out.println("Autor: " + loc.getAutor());
		
		if(loc.getCategoria()<1 || loc.getCategoria()>2){
			System.out.println("");
		}else{
		if (loc.getCategoria()==1){
			loc.setPreco(loc.getPreco()+(loc.getPreco()*0.40));
		}else{
			loc.setPreco(loc.getPreco()-(loc.getPreco()*0.20));
		}
		}
		
		if (loc.getPreco()>5.0){
			System.out.println("Categoria: Lançamento");
		}else{if(loc.getPreco()<5.0){
			System.out.println("Categoria: Infantil");
			}else{
				System.out.println("Categoria: Inválida");
			}
		
		}
		
		System.out.println("Preco Final: R$" + loc.getPreco());
		
		sc.close();
	}
}