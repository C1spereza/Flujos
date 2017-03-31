package AbbMenu;

import java.io.*;
import java.util.Scanner;

import ABBNotas.ArbolBinario;
import ABBNotas.Nodo;

public class Test {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		ArbolBinario arbol = new ArbolBinario();
		ObjectInputStream in = null;
		Scanner entrada = new Scanner(System.in);
		String nombre;
		Nodo n;
		

		try {
			in = new ObjectInputStream(new BufferedInputStream(new FileInputStream("arbolnotas.txt")));
			arbol = (ArbolBinario) in.readObject();
			
						
			System.out.println("Dame el nombre del alumno: ");
			nombre=entrada.nextLine();
			
			n = buscarNota(arbol.raizArbol(), nombre);
			if(n==null){
				System.out.println("No se ha encontrado el alumno.");
			}else{
				System.out.println(n);
			}
			
		} finally {
			if (in != null) {
				in.close();
			}
		}

	}
	
	public static ABBNotas.Nodo buscarNota(ABBNotas.Nodo n, String nombre){
		if(n==null){
			return null;
		}
		if(n.getNombre().compareTo(nombre)==0){
			return n;
		}else{
			if(n.getNombre().compareTo(nombre)>0){
				return buscarNota(n.subarbolIzdo(), nombre);
			}else{
				return buscarNota(n.subarbolDcho(), nombre);
			}
		}
	}

}
