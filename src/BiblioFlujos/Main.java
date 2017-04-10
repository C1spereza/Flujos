package BiblioFlujos;
import miLibreria.Entrada;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int opc;
		Entrada entrada = new Entrada();
		
		do{
			System.out.println("\t Introducir Libro");
			System.out.println("-------------------------------------------");
			System.out.println("1- Introducir libro");
			System.out.println("2- Cambiar titulo del libro");
			System.out.println("3- Cambiar autor del libro");
			System.out.println("4- Cambiar cantidad de ejemplares");
			System.out.println("5- Prestar libro");
			System.out.println("6- Devolver libro");
			System.out.println("7- Consultar libro");
			System.out.println("8- Listado de libros");
			System.out.println("-------------------------------------------");
			System.out.println("0- Salir");
			System.out.println("-------------------------------------------");
			opc=entrada.obtenerEntero("Elija una opcion (1-8)");

	}

}
