package ListadeExercicios1;
public class Fatura {
	
	private String numero;
	private String descricao;
	private int quantidade;
	private double preco;
	
	
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		if (quantidade < 0){
			quantidade = 0;
		}else{
		this.quantidade = quantidade;
		}
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		if (preco < 0.0){
			preco = 0.0;
		}else{
		this.preco = preco;
		}
	}
	
	public double getValorFatura(double ValFatura){
		ValFatura = quantidade * preco;
		return ValFatura;
	}
}
