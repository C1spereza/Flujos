package Ejemplos;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.PrintWriter;
import java.io.IOException;
import java.util.Scanner;

public class EjemploPrueba4 {

	public static int leerArchivo(String[] vector) {
		// vector=new String[6];
		int contador = 0;
		try {
			BufferedReader inputStream = new BufferedReader(new FileReader("nombres.txt"));
			String l;

			while ((l = inputStream.readLine()) != null) {
				vector[contador] = l;
				contador++;
			}
		} catch (IOException e) {
		}

		return contador;
	}

	public static void rellenarVector(String[] vector, int contador) {
		int i = 0;
		String nombre1, l;
		try {
			PrintWriter outputStream = null;
			BufferedReader inputStream = null;
			inputStream = new BufferedReader(new FileReader("nombres.txt"));
			outputStream = new PrintWriter(new FileWriter("nombres.txt"));
			Scanner entrada = new Scanner(System.in);
			
			while ((l = inputStream.readLine()) != null) {
                outputStream.println(l);
            }

			for (i = contador; i < vector.length; i++) {
				System.out.println("Dame el nombre de otra persona:");
				nombre1 = entrada.next();
				vector[i] = nombre1;
				//outputStream.println(nombre1);
			}
			
			for(i=0; i<vector.length; i++){
				outputStream.println(vector[i]);
			}
			if (outputStream != null) {
                outputStream.close();
            }
		} catch (IOException e) {}
	}

	public static void mostrarVector(String[] vector) {
		int i = 0;

		for (i = 0; i < vector.length; i++) {
			System.out.println(vector[i]);
		}
	}

	public static void main(String[] args) throws IOException {

		BufferedReader inputStream = null;
		String[] vector = new String[6];
		// Scanner entrada = new Scanner(System.in);
		int contador = 0;
		// String nombre1, nombre;

		try {
			// inputStream = new BufferedReader(new FileReader("nombres.txt"));

			contador = leerArchivo(vector);
			rellenarVector(vector, contador);
			mostrarVector(vector);

			/*
			 * String l; while ((l = inputStream.readLine()) != null) {
			 * vector[contador] = l; contador++; } for (i = 4; i <
			 * vector.length; i++) {
			 * System.out.println("Dame el nombre de otra persona:"); nombre1 =
			 * entrada.next(); vector[i] = nombre1; } for (i = 0; i <
			 * vector.length; i++) { System.out.println(vector[i]); }
			 */
		} finally {
			if (inputStream != null) {
				inputStream.close();
			}
		}
	}
}