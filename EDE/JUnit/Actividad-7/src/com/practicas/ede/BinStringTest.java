package com.practicas.ede;

import static org.junit.Assert.*;
import junit.framework.*;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import org.junit.Test;

public class BinStringTest {

	private BinString binString;	
	
	public BinStringTest(){
		// Completar
		binString = new BinString();
	}
	
	@Test
	public void  sumarTest(){
		// Test de la función sumar
		int valorEsperado=0;
		int valorReal=binString.sumar("");
		
		assertEquals(valorEsperado, valorReal);
		
		valorEsperado=100;
		
		valorReal=binString.sumar("d");
		
		assertEquals(valorEsperado, valorReal);
		
		valorEsperado=80;
		
		valorReal=binString.sumar("P");
		
		assertEquals(valorEsperado, valorReal);
	}
	
	@Test
	public void aBinarioTest() {
		// Test de la función aBinario
		String valorEsperado="1100";
		
		String valorReal=binString.aBinario(12);
		
		assertEquals(valorEsperado, valorReal);
		
		valorEsperado="1111";
		
		valorReal=binString.aBinario(15);
		
		assertEquals(valorEsperado, valorReal);
		
		valorEsperado="1001";
		
		valorReal=binString.aBinario(9);
		
		assertEquals(valorEsperado, valorReal);

	}
	
	@Test
	public void convertirTest() {
		// Test de la función convertirTest
		String valorEsperado="1000001";
		
		String valorReal=binString.convertir("A");
		
		assertEquals(valorEsperado, valorReal);
		
		valorEsperado="1000110";
		
		valorReal=binString.convertir("F");
		
		assertEquals(valorEsperado, valorReal);
		
		valorEsperado="1100111";
		
		valorReal=binString.convertir("g");
		
		assertEquals(valorEsperado, valorReal);
	}
}
