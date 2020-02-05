package edu.elsmancs.dni;

import static org.junit.Assert.*;
import org.junit.Test;


public class TablaAsignacionTest {
	
	@Test
    public void getLetraTest() {
		TablaAsignacion tabla = new TablaAsignacion();
		System.out.println(tabla.getLetra(0));
		System.out.println(tabla.getLetra(22));
    }
	
	@Test
    public void getCantidadLetrasTest() {
		TablaAsignacion tabla = new TablaAsignacion();
		assertEquals(tabla.getCantidadLetras(), 23);
    }
}
