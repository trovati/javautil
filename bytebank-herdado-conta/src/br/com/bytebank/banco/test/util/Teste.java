package br.com.bytebank.banco.test.util;

import java.util.ArrayList;
import java.util.List;

public class Teste {
	public static void main(String[] args) {
		
		int [] idades = new int [5];
		String [] nomes = new String [5];
		
		int idade = 29; //Integer
		
		Integer idadeRef = Integer.valueOf(29); //autoboxing
		int valor = idadeRef.intValue(); //unboxing
		
		String s = args[0];
		
		List <Integer> numeros = new ArrayList<Integer>();
		numeros.add(29);
		
	}
}
