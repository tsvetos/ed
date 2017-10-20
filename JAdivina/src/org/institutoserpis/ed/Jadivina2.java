package org.institutoserpis.ed;

import java.util.Random;
import java.util.Scanner;

public class Jadivina2 {

	public static void main(String[] args) {

		        Random random = new Random();
		        int numeroAleatorio = random.nextInt(1000) + 1;
		        int contadorDeIntentos = 1;

		        System.out.println("Número aleatorio=" + numeroAleatorio);

		        Scanner scanner = new Scanner(System.in);
		        System.out.printf("Adivina el número (entre 1 y 1000) [intento %d]: ", contadorDeIntentos);

		        String numero = scanner.nextLine();
		        int numeroIntroducido = Integer.parseInt(numero);

		        while (numeroIntroducido != numeroAleatorio) {
		        	contadorDeIntentos++;
		            if (numeroAleatorio < numeroIntroducido)
		                System.out.printf("Es menor que ese. Vuelve a intentarlo:(entre 1 y 1000) [intento %s]: ", contadorDeIntentos  );
		            else
		                System.out.printf("Es mayor que ese. Vuelve a intentarlo: (entre 1 y 1000) [intento %s]: ", contadorDeIntentos );
		            numero = scanner.nextLine();
		            numeroIntroducido = Integer.parseInt(numero);
		        }
		        System.out.printf("Enhorabuena. Has acertado en %s %s. \n" ,
		        		contadorDeIntentos, contadorDeIntentos == 1 ? "intento" : "intentos");
		    }

		

	}


