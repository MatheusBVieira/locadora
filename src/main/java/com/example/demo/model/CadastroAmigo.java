package com.example.demo.model;

import java.util.ArrayList;

public class CadastroAmigo {
	
	public ArrayList<Amigo> amigos;
	
	public void inclui(Amigo amigo) {
		amigos.add(amigo);
	}
	
	public void altera(int id, Amigo amigo) {
		amigos.remove(id);
		amigos.add(amigo);
	}
	
	public void exclui(int id) {
		amigos.remove(id);
	}
	
}
