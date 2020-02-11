package edu.elsmancs.dni;

public class Dni {
	
	private final String DNI;
	private TablaAsignacion tabla;
	private Boolean numeroSano = false;
	private Boolean dniSano = false;
	private Boolean letraSana = false;
	private final byte LONGITUD_DNI = 9;
	
	public Dni(String DNI) {
		this.DNI = DNI;
	};
	
	private String getDni() {
		return this.DNI;
	}
	
	private void setNumeroSano(Boolean valor) {
		this.numeroSano = valor;
	}
	
	private Boolean isNumeroSano() {
		return this.numeroSano;
	}
	
	private void setLetraSana(Boolean valor) {
		this.letraSana = valor;
	}
	
	private Boolean isLetraSana() {
		return this.letraSana;
	}
	
	private void setDniSano(Boolean valor) {
		this.dniSano = valor;
	}
	
	private Boolean isDniSano() {
		return this.dniSano;
	}
	
	private TablaAsignacion getTablaAsignacion() {
		return this.tabla;
	}
	
	@Override
	public String toString() {
		return this.DNI;
	}
	
	public Boolean checkDNI() {
		setDniSano(checkNumeroDNI() && checkLetra());
		return isDniSano();
	}
	
	public Boolean checkNumeroDNI() {
		setNumeroSano(checkLongitudDNI() && isDNINumero(extraerParteNumericaDNI()));
		return isNumeroSano();
	}
	
	public Boolean checkLetra() {
		checkNumeroDNI();
		if (isNumeroSano()) {
			setLetraSana(Character.isUpperCase(extraerParteAlfabeticaDni()) 
							&& checkLetraValida());
			return isLetraSana();
		} else {
			return false;
		}
	}
	
	public Character obtenerLetra() {
		// calcularLetra no puede ejecutarse si antes
		// no se cumplen las condiciones previas en
		// checkDni y checkLetra
		checkNumeroDNI();
		if (isNumeroSano()) {
			return getTablaAsignacion().calcularLetra(extraerParteNumericaDNI());
		} else {
			// si el DNI no esta bien formado
			return Character.MIN_VALUE;
		}
	}
	
	private Boolean checkLongitudDNI() {
		return getDni().length() == this.LONGITUD_DNI;
	}
	
	Boolean isDNINumero(String cadena) {
		for (int i = 0; i < cadena.length(); i++) {
			if (!Character.isDigit(cadena.charAt(i))) {
				return false;
			} else
				;
		}
		return true;
	}
	
	String extraerParteNumericaDNI() {
		return (String) DNI.substring(0, DNI.length() - 1);
	}
	
	Character extraerParteAlfabeticaDni() {
		return DNI.charAt(DNI.length() - 1);
	}

	private Boolean checkLetraValida() {
		return extraerParteAlfabeticaDni() == obtenerLetra();
	}
}
