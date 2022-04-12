package com.example.demo.model;

import lombok.Data;

@Data
public class FaixaEtaria {

	private int de;
	private int ate;
	
	public boolean ehAbaixo(Integer idade) {
		return ( idade > de && idade < ate ) ? true : false;
	}
	
}
