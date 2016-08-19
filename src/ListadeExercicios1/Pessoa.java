package ListadeExercicios1;

import java.util.Scanner;

public class Pessoa {

	private int cpf;
	private String nome;

	Scanner leitor = new Scanner(System.in);

	public int getCpf() {
		return cpf;
	}

	public void setCpf(int cpf) {
		this.cpf = cpf;
		System.out.print("Digite o cpf: ");
		cpf = leitor.nextInt();
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
		System.out.print("Digite o nome do proprietário: ");
		nome = leitor.nextLine();
	}

}