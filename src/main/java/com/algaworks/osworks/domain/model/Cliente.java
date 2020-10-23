package com.algaworks.osworks.domain.model;

public class Cliente {

	private Long id;
	private String nome;
	private String email;
	private String telefone;
	
	public Cliente() {
		
	}

	public Cliente(Long id, String nome, String email, String telefone) {
		super();
		this.setId(id);
		this.nome = nome;
		this.email = email;
		this.telefone = telefone;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
	
	
}
