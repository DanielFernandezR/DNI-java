package edu.elsmancs.utilidades;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

import edu.elsmancs.dni.Dni;;

public class MainDni {

	public static void main(String[] args) {
		
		int numeroCasos = 25;
		StringBuilder caso = null;

		/**
		 * Generar 25 casos test incorrectos
		 * Este kata es para practicar manejo 
		 * de la clase String de Java
		 */
		
		List<String> casosTest = new ArrayList<>();
		
		for (int i = 1; i <= numeroCasos; i++) {

			caso = new StringBuilder("");

			for (int j = 1; j < 9; j++) {
				Integer caracterAscii = ThreadLocalRandom.current().nextInt(48, 59);
				caso.append(String.valueOf(Character.toChars(caracterAscii)));
			}
			Integer caracterAscii = ThreadLocalRandom.current().nextInt(65, 91);
			caso.append(String.valueOf(Character.toChars(caracterAscii)));
			casosTest.add(caso.toString());
		}
		
		System.out.println("\n ***** Casos Test generados aleatoriamente ***** \n");
		
		for (String casoTest : casosTest) {
			System.out.println(casoTest);
		}

		/** 
		 * Manejo de la interfaz publica de la clase Dni
		 */
		
		System.out.println("\n ***** Casos Test aleatorios ***** \n");
		
		Dni objetoDni = null;
		for (String dni : casosTest) {

			objetoDni = new Dni(dni);
			System.out.print(objetoDni.toString());
			
			if (objetoDni.checkDNI()) {
				System.out.println(" PASS");
			} else {
				System.out.println(" FAIL");
			}
			
			System.out.println("dni --> " + objetoDni.checkDNI());
			System.out.println("letra --> " + objetoDni.checkLetra());

			try {
				System.out.println("La letra debería ser --> " + objetoDni.obtenerLetra());
			}
			catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("La letra es --> " + objetoDni.toString().charAt(8));
			}
		}

		/**
		 * Casos test correctos
		 */
		
		String[] casosTestPass = { //casos OK
		 		"78484464T","72376173A","01817200Q","95882054E","63587725Q",
		 		"26861694V","21616083Q","26868974Y","40135330P","89044648X",
		 		"80117501Z","34168723S","76857238R","66714505S","66499420A"};
		
		System.out.println("\n ***** Casos Test Correctos ***** \n");
		
		objetoDni = null;
		for (String dni : casosTestPass) {

			objetoDni = new Dni(dni);
			System.out.print(objetoDni.toString());
			
			if (objetoDni.checkDNI()) {
				System.out.println(" PASS");
			} else {
				System.out.println(" FAIL");
			}

			System.out.println("dni --> " + objetoDni.checkDNI());
			System.out.println("letra --> " + objetoDni.checkLetra());

			try {
				System.out.println("La letra debería ser --> " 
										+ objetoDni.obtenerLetra());
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("La letra es --> " +
									objetoDni.toString().charAt(8));
			}
		}
	}
}