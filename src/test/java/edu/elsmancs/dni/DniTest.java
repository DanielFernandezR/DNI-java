package edu.elsmancs.dni;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class DniTest {

	private Dni dniprueba;

	@Test
	public void checkNumDNI() {
		dniprueba = new Dni("43235632W");
		assertTrue(dniprueba.checkNumeroDNI());
	}
}
