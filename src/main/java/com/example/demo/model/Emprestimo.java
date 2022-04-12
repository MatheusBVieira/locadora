
package com.example.demo.model;

import java.util.Date;

import lombok.Data;

@Data
public class Emprestimo {

	private Date dataEmprestimo;
	private Date dataDevolver;
	private Amigo amigo;
	private DVD dvd;
	
}
