package com.example.demo.model;

import lombok.Data;

@Data
public class DVD {

	private String titulo;
	private String sinopse;
	private Pessoa artistaPrincipal;
	private Pessoa diretor;
	private Genero genero;
	private FaixaEtaria classificacao;
	
}
