package ListadeExercicios1;

import java.util.Scanner;

public class Locadora {
	
	private Autor autor;
	private String titulo;
	private double preco = 5.00;
	private int categoria;

	Scanner sc = new Scanner(System.in);
	
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	public int getCategoria() {
		return categoria;
	}
	public void setCategoria(int categoria) {
		this.categoria = categoria;
	}
	public Autor getAutor() {
		System.out.println("Digite o nome do Autor: ");
		autor.setNome(sc.nextLine());
		return autor;
	}
	public void setAutor(Autor autor) {
		this.autor = autor;
	}

	
}