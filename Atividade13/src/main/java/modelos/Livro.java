package modelos;

import java.io.Serializable;

public class Livro implements Serializable {

	private String nome;
	private Integer ano;
	private String autor;
	
	public Livro() {}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getAno() {
		return ano;
	}

	public void setAno(Integer ano) {
		this.ano = ano;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	@Override
	public String toString() {
		return "O nome do livro é " + nome + ", publicado em " + ano + ", do autor(a) " + autor + "." + "<br>";
	}
	
}
