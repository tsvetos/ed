package org.institutoserpis.ed;
import java.util.Scanner;

public class Comparador {
	
		public static void main(String[] args) {
			double numero1,numero2,primernumero=0,segundonumero=0;
			Scanner teclado = new Scanner(System.in);
			System.out.println( "Ingrese el primer numero");
			numero1= teclado.nextDouble();
			System.out.println ("Ingrese el segundo numero");
			numero2= teclado.nextDouble();
			if (numero1<numero2) {
			 primernumero= numero1;
			 segundonumero= numero2;
			}
			if (numero1>numero2) {
				primernumero= numero2;
				segundonumero= numero1;
			}
			System.out.println("Los numeros ordenados de menor a mayor son:" + primernumero +" ," + segundonumero);
			}
	}


