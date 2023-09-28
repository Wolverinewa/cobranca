package com.lilossystems.cobranca.model;

public enum StatusTitulo {
	PENDENTE("Pendente"),
	RECEBIDO("Recebido");
	
	private String descricao;
	
	private StatusTitulo(String descricao) {
		this.descricao = descricao;
	}
	
	private String getDescricao() {
		return this.descricao;
	}
}
