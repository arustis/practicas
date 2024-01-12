package com.educacionit.desafio5;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio_01 {

	public static void main(String[] args) {
		String oracion = "";
		char[] arrayLetras;
		String[] arrayPalabras;
		int contadorPalabras = 0;
		String palabraRepetida;
		int contador = 0;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Bienvenido al programa parta analizar oraciones");
		while (true) {
			System.out.println("Por favor, indique la oracion que desea evaluar (no puede esta vacia)");
			oracion = scanner.nextLine();
			if (oracion.isBlank()) {
				System.out.println("¡La oracion esta vacia, por favor intente nuevamente!\n");
			} else {
				break;
			}

		}
		arrayPalabras = oracion.split(" ");
		System.out.println("La oracion contiene: " + arrayPalabras.length + " palabra/s");
		for (int i = 0; i < arrayPalabras.length; i++) {
			String palabra = arrayPalabras[i];

			for (int j = 0; j < arrayPalabras.length; j++) {
				if (palabra.equals(arrayPalabras[j])) {
					contador++;
				}

			}
			if (contador == 1) {
				contador = 0;
			}
		}
		if (contador > 1) {
			System.out.println("Hay palabras repetidas");
		} else {
			System.out.println("Ninguna palabra se repite");
		}
		
		Arrays.sort(arrayPalabras);
		String palabrasOrdenadas = Arrays.toString(arrayPalabras);
		System.out.println("Palabras ordenadas: " + palabrasOrdenadas);
		
		oracion = oracion.replaceAll(" ", "");
		arrayLetras = oracion.toCharArray();
		Arrays.sort(arrayLetras);
		String letrasOrdenadas = Arrays.toString(arrayLetras);
		System.out.println("Letras ordenadas: " + letrasOrdenadas);
		

	}

}
