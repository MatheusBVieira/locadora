package com.example.demo.model;

import java.util.ArrayList;

public class CadastroDVD {

	public ArrayList<DVD> dvds;

	public void inclui(DVD dvd) {
		dvds.add(dvd);
	}

	public void altera(int id, DVD dvd) {
		dvds.remove(id);
		dvds.add(dvd);
	}

	public void exclui(int id) {
		dvds.remove(id);
	}

}
