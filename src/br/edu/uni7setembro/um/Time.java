package br.edu.uni7setembro.um;

import java.util.ArrayList;
import java.util.List;

public class Time {
	
	String nome;
	String serie;
	List<Titulo> titulos = new ArrayList<Titulo>();
	
	public Time(String nome, String serie) {
		this.nome = nome;
		this.serie = serie;
	}	

}
