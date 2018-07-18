package com.lovelacetecnologia.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.lovelacetecnologia.Telefone;

public class TelefoneTest {

	
	private Telefone telefone;
	
	@Before
	public void setup() throws Exception {
		
		telefone = new Telefone();
	}
	
	
	@Test
	public void deveIdentificarDDD() throws Exception {
		
		
		assertEquals("24", telefone.pegandoDdd("24 992189633"));
		
	}
	
	@Test
	public void deveIdentificarAtravesDddOEstado() throws Exception {
		
		assertEquals("RJ", telefone.pegandoDddIdentificandooEstado("24"));
		
	}
	
	@Test
	public void devePegarSomenteNumeroDoCelular() throws Exception {
			
		assertEquals("992123456", telefone.pegandoNumero("(24)992123456"));
		
	} 
	
	
}
