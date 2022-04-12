package com.example.demo;

import java.awt.geom.GeneralPath;

import com.example.demo.model.Amigo;
import com.example.demo.model.CadastroAmigo;
import com.example.demo.model.CadastroDVD;
import com.example.demo.model.DVD;
import com.example.demo.model.FaixaEtaria;
import com.example.demo.model.Genero;
import com.example.demo.model.Interface;
import com.example.demo.model.Pessoa;
import com.example.demo.model.RegistroEmprestimo;

public class Run {

	public static void main(String[] args) {
		
		CadastroAmigo cadastroAmigo = new CadastroAmigo();
		cadastroAmigo(cadastroAmigo);
		
		CadastroDVD cadastroDVD = new CadastroDVD();
		cadastraDVD(cadastroDVD);
		
		RegistroEmprestimo registroEmprestimo = new RegistroEmprestimo();
		registroEmprestimo.empresta(cadastroAmigo.amigos.get(0), cadastroDVD.dvds.get(0));
		
		new Interface();
		
		
		
	}

	private static void cadastraDVD(CadastroDVD cadastroDVD) {
		DVD dvd = new DVD();
		Pessoa artistaPrincipal = new Pessoa();
		artistaPrincipal.setNome("Cesão");
		dvd.setArtistaPrincipal(artistaPrincipal);
		
		Pessoa diretor = new Pessoa();
		diretor.setNome("Damiani");
		dvd.setDiretor(diretor);
		
		FaixaEtaria faixaEtaria = new FaixaEtaria();
		faixaEtaria.setDe(16);
		faixaEtaria.setAte(30);
		dvd.setClassificacao(faixaEtaria);
		
		Genero genero = new Genero();
		genero.setDescricao("Terror");
		dvd.setGenero(genero);
		
		dvd.setSinopse("Um baita filme de terror");
		dvd.setTitulo("Panico na ilha");
		
		cadastroDVD.inclui(dvd);
	}

	private static void cadastroAmigo(CadastroAmigo cadastroAmigo) {
		Amigo amigo = new Amigo();
		amigo.setNome("Matheus B Vieira");
		amigo.setEmail("matheusbvieira@hotmail.com");
		amigo.setEndereco("Minha casa");
		
		FaixaEtaria faixaEtariaAmigo = new FaixaEtaria();
		faixaEtariaAmigo.setDe(21);
		amigo.setFaixaEtaria(faixaEtariaAmigo);

		
		cadastroAmigo.inclui(amigo);
	}

}
