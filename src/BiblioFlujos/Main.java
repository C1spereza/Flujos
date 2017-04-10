package BiblioFlujos;
import miLibreria.Entrada;
import java.io.*;
import java.util.Scanner;

import ABBNotas.ArbolBinario;

public class Main {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		int opc;
		int isbn;
		String nombre, autor;
		boolean bucle=true;
		ObjectInputStream in = null;
		Entrada entrada = new Entrada();
		
		do{
			System.out.println("\t Libreria");
			System.out.println("-------------------------------------------");
			System.out.println("1- Introducir libro");
			System.out.println("2- Mostrar libro");
			System.out.println("3- Introducir usuario");
			System.out.println("4- Mostrar usuario");
			System.out.println("5- Prestar libro");
			System.out.println("6- Devolver libro");
			System.out.println("7- Consultar libro");
			System.out.println("8- Consultar usuario");
			System.out.println("-------------------------------------------");
			System.out.println("0- Salir");
			System.out.println("-------------------------------------------");
			opc=entrada.obtenerEntero("Elija una opcion (1-8)");
			
			switch(opc){
			case 1:
				try {
					in = new ObjectInputStream(new BufferedInputStream(new FileInputStream("libros.txt")));					
								
					nombre=entrada.obtenerString("Dame el nombre del libro:");
					autor=entrada.obtenerString("Dame el nombre del autor:");
					isbn=entrada.obtenerEntero("Dame el ISBN del libro:");
					
					Libro libro = new Libro(autor, nombre, isbn);
					
					libro = (Libro) in.readObject();
					
					entrada.obtenerString("Libro introducido correctamente. Pulsa [Intro] para continuar.");
					borrarPantalla();
					
				} finally {
					if (in != null) {
						in.close();
					}
				}
			break;
			case 2:
			}
			}while(bucle==true);

	}
			
	public static void borrarPantalla(){
		System.out.println("\033[H\033[2J");
		System.out.flush();
	}

}
