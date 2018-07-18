package com.lovelacetecnologia.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.lovelacetecnologia.CamelCaseConverter;

public class CamelCaseConverterTest {

	private CamelCaseConverter camelCase;

	@Before
	public void setup() {

		camelCase = new CamelCaseConverter();
	}

	@Test
	public void aplicarCamelCaseEmNomeUnico() throws Exception {

		assertEquals("Lionel", camelCase.converter("lionel"));

	}

	@Test
	public void deveConverterNomeSimplesMisturadoMaiusculoEMinusculo() throws Exception {

		assertEquals("Lionel", camelCase.converter("LiONeL"));

	}

	@Test
	public void deveConverterNomeCompleto() throws Exception {

		assertEquals("Lionel Messi", camelCase.converterNomeCompleto("Lionel" , " Messi"));

	}
	
	
}
