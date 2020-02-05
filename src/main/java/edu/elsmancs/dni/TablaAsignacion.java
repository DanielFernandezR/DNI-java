package edu.elsmancs.dni;

import java.util.Vector;

public class TablaAsignacion {
	
	char[] tablaLetras = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E' };
	
	public char getLetra(int posicionLetra) {
		return this.tablaLetras[posicionLetra];
	}
	
	public int getCantidadLetras() {
		return this.tablaLetras.length;
	}
}
