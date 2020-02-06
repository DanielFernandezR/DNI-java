package edu.elsmancs.dni;

import static org.junit.Assert.*;

import org.junit.Test;

public class DniTest {

	@Test
	public void getDNITest() {
		Dni dniprueba = new Dni();
		assertEquals(dniprueba.getDNI(43235632), "43235632W");
	}
}
