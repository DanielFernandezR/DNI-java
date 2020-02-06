package edu.elsmancs.dni;

public class TablaAsignacion {
	
	char[] tablaLetras = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E' };
	
	public char getLetra(int posicionLetra) {
		return this.tablaLetras[posicionLetra];
	}
	
	public int getCantidadLetras() {
		return this.tablaLetras.length;
	}
	
	public boolean verificarLetra(char letra) {
		String tabladeletras = String.valueOf(letra);
		return tabladeletras.contains(Character.toString(letra));
	}
	
	public char calcularLetra(int dni) {
		int numLetra = dni % getCantidadLetras();
		return getLetra(numLetra);
	}
}
