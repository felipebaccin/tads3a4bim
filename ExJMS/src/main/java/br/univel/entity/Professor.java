package br.univel.entity;

import java.io.Serializable;

public class Professor implements Serializable {

	private long matricula;
	private String nome;
	
	public long getMatricula() {
		return matricula;
	}
	public void setMatricula(long matricula) {
		this.matricula = matricula;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
	
	
}
