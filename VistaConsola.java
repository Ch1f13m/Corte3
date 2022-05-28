package Vista;

import java.util.Scanner;

public class VistaConsola {
	/**
	 * This attribute reads the commands that are performed by the user through the keyboard.
	 */
private Scanner leer;
	/**
	 * This method is the one that reads the keyboard commands and saves them
	 */
	public VistaConsola() {
		leer = new Scanner(System.in);
	}
	/**
	 * Lee los datos enteros. 
	 * @param mensaje It is the one that will help us convert the data that the user writes into String and then pass it to an integer
	 * @return dato which helps us to leave the variable again in 0
	 */
	public int leerDatoEntero(String mensaje) {
		int dato = 0;
		System.out.println(mensaje);
		dato = leer.nextInt();
		leer.nextLine();
		return dato;
	}
	/**
	 * 
	 * @param mensaje Is the one that will help us convert the data that the user writes into String
	 * @return dato which helps us to leave the variable empty again
	 */
	public char leerDatoCaracter(String mensaje) {
		char dato = ' ';
		System.out.println(mensaje);
		dato = leer.next().charAt(0);
		leer.nextLine();
		return dato;
	}
	public String leerDato(String mensaje) {
		String dato = "";
		System.out.println(mensaje);
		dato = leer.nextLine();
		return dato;
	}
	/**
	 * 
	 * @param mensaje is the one that will help us convert the data that the user writes into String
	 * @return dato which helps us to leave the variable empty again
	 */
	public String leerCadenaCaracteres(String mensaje) {
		String dato = "";
		System.out.println(mensaje);
		dato = leer.next();
		return dato;
	}
	/**
	 * 
	 * @param mensaje It will help us to show the information that we would like to show the user.
	 */
	public void mostrarInformacion(String mensaje) {
		System.out.println(mensaje);
	}

}
