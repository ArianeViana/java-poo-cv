//classe abstrata
//n�o pode ser instanciada

package br.com.cursovideo;

public abstract class Aula11Pessoa {
	private String nome;
	private int idade;
	private String sexo;
	
	
	public void fazerAniversario() {
		this.idade ++;
	}


	public String getNome() {
		return this.nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public int getIdade() {
		return this.idade;
	}


	public void setIdade(int idade) {
		this.idade = idade;
	}


	public String getSexo() {
		return this.sexo;
	}


	public void setSexo(String sexo) {
		this.sexo = sexo;
	}


	@Override
	public String toString() {
		return "Aula11Pessoa [nome=" + nome + ", idade=" + idade + ", sexo=" + sexo + "]";
	}

}
