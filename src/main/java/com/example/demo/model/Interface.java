package com.example.demo.model;

public class Interface {

	public void imprime(String string) {
		System.out.println(string);
	}
	
	public void imprimeMenu() {
		System.out.println("Menu");
	}
	
	public DVD leDVD() {
		return new DVD();
	}
	
	public Amigo leAmigo() {
		return new Amigo();
	}
	
	public Emprestimo leEmprestimo() {
		return new Emprestimo();
	}
	
	public void alertaFaixaEtaria(Amigo amigo, DVD dvd) {
		
	}
	
	
}
