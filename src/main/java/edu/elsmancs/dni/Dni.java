package edu.elsmancs.dni;

public class Dni {
	
	private TablaAsignacion tabla;
	
	public String getDNI(int dni) {
		char letraDNI = tabla.calcularLetra(dni);
		String fullDNI = String.valueOf(dni) + Character.toString(letraDNI);
		System.out.println("La letra que le corresponde a " + letraDNI + "es: " + fullDNI);
		return fullDNI;
    }
}
