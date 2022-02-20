package entities;

import java.util.List;
import java.util.Objects;

public class Produto {

	private String nome;
	private Double preço;
	private int qtd;


	public Produto() {
	}

	public Produto(String nome, Double preço, int qtd) {
		this.nome = nome;
		this.preço = preço;
		this.qtd = qtd;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getPreço() {
		return preço;
	}

	public void setPreço(Double preço) {
		this.preço = preço;
	}

	public int getQtd() {
		return qtd;
	}

	public void setQtd(int qtd) {
		this.qtd = qtd;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Produto produto = (Produto) o;
		return qtd == produto.qtd && Objects.equals(nome, produto.nome) && Objects.equals(preço, produto.preço);
	}

	@Override
	public int hashCode() {
		return Objects.hash(nome, preço, qtd);
	}

	@Override
	public String toString() {
		return  nome + ", preço = " + preço +
				", Quantidade = " + qtd ;
	}


}
