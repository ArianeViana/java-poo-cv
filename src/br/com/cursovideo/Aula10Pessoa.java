package br.com.cursovideo;

public class Aula10Pessoa {
	private String nome;
	private int idade;
	private String sexo;
	
	public void fazerAniversario() {
		this.setIdade(this.getIdade() + 1);
	}
	
	public String getNome() {
		return this.nome;
	}

	public void setNome(String n) {
		this.nome = n;
	}

	public int getIdade() {
		return this.idade;
	}

	public void setIdade(int i) {
		this.idade = i;
	}

	public String getSexo() {
		return this.sexo;
	}

	public void setSexo(String s) {
		this.sexo = s;
	}

	@Override
	public String toString() {
		return "Aula10Pessoa [nome=" + nome + ", idade=" + idade + ", sexo=" + sexo + "]";
	}
	
	
}
