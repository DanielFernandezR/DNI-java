package edu.elsmancs.dni;

public class TablaAsignacion {
	
	char[] tablaLetras = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E' };
	
	TablaAsignacion(){};
	
	public char getLetra(int posicionLetra) throws ArrayIndexOutOfBoundsException {
		
		try {
		return this.tablaLetras[posicionLetra];
		}
		catch(ArrayIndexOutOfBoundsException exception) {
			throw new ArrayIndexOutOfBoundsException(
					"Posicion fuera de los limites de la tabla de asignación");
		}
	}
	
	public int getCantidadLetras() {
		return this.tablaLetras.length;
	}
	
	public boolean verificarLetra(char letra) {
		String tabladeletras = String.valueOf(letra);
		return tabladeletras.contains(Character.toString(letra));
	}
	
	public char calcularLetra(String DNI) {
		int dni = Integer.parseInt(DNI);
		int numLetra = dni % getCantidadLetras();
		return getLetra(numLetra);
	}
}
