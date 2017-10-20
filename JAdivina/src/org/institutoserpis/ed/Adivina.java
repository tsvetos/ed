package org.institutoserpis.ed;

import java.util.Scanner;

public class Adivina {

	public static void main(String[] args) {
		 int numeroSecreto;
		 int adivina;
		 numeroSecreto = (int) (Math.random() * 999 + 1);           
		 Scanner scanner = new Scanner(System.in);
		 do {
			 System.out.print("Introduce para adivinar: ");
			 adivina = scanner.nextInt();
			 if (adivina == numeroSecreto)
				 System.out.println("Has acertado!");
			 else if (adivina < numeroSecreto)
				 System.out.println("Estas por debajo, sigue probando");
			 else if (adivina > numeroSecreto)
				 System.out.println("Estas por encima, sigue probando");
     		 } while (adivina != numeroSecreto);

   }

}
