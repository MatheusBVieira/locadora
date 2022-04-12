package com.example.demo.model;

import java.util.ArrayList;
import java.util.Date;

public class RegistroEmprestimo {

	public ArrayList<Emprestimo> emprestimos;
	
	public void empresta(Amigo amigo, DVD dvd) {
		Emprestimo emprestimo = new Emprestimo();
		emprestimo.setAmigo(amigo);
		emprestimo.setDataDevolver(new Date());
		emprestimo.setDataEmprestimo(new Date());
		emprestimo.setDvd(dvd);
		
		emprestimos.add(emprestimo);
	}
	
	public void devolve(DVD dvd) {
		emprestimos.remove(dvd);
	}
	
	public boolean estahEmprestado(DVD dvd) {
		return emprestimos.contains(dvd);
	}
	
	public boolean faixaEtariaAbaixo(DVD dvd, Amigo amigo) {
		return dvd.getClassificacao().ehAbaixo(amigo.getFaixaEtaria().getDe());
	}
	
}
