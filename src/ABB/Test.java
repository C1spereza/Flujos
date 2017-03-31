package ABB;

import java.io.*;

public class Test {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		ArbolBinario arbol = new ArbolBinario();
		String num;
		int numero;
		
		BufferedReader inputStream = null;
		
		try {
			inputStream = new BufferedReader(new FileReader("numeros.txt"));			

			while ((num = inputStream.readLine()) != null){
				numero = Integer.parseInt(num);
				arbol.insertar(numero, arbol.raizArbol());
				
			}

		} finally {
			if (inputStream != null) {
				inputStream.close();
			}

		}
		System.out.println("Inorden:");
		inorden(arbol.raizArbol());
		System.out.println();
		System.out.println("Preorden:");
		preorden(arbol.raizArbol());
		System.out.println();
		System.out.println("Postorden:");
		postorden(arbol.raizArbol());
		
	}
	
	public static void preorden(Nodo r) {
		if (r != null) {
			r.visitar();
			preorden(r.subarbolIzdo());
			preorden(r.subarbolDcho());
		}
	}
	
	public static void inorden(Nodo r) {
		if (r != null) {
			inorden(r.subarbolIzdo());
			r.visitar();
			inorden(r.subarbolDcho());
		}
	}
	
	public static void postorden(Nodo r) {
		if (r != null) {
			postorden(r.subarbolIzdo());
			postorden(r.subarbolDcho());
			r.visitar();
		}
	}

}
