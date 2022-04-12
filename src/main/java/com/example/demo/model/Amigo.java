package com.example.demo.model;

import lombok.Data;

@Data
public class Amigo extends Pessoa{

	private Long numTelefone;
	private String email;
	private String endereco;
	private FaixaEtaria faixaEtaria;
	
}
