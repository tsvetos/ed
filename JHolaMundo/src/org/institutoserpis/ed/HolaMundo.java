package org.institutoserpis.ed;

public class HolaMundo {
	public static void main(String[] args) {
		System.out.print("Dime tu nombre: ");
		String nombre = System.console().readLine();
		System.out.println("Hola " + nombre);
	}

}
