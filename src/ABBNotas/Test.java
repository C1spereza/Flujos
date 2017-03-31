package ABBNotas;

import java.io.*;
import listaNotas.*;

public class Test {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		ArbolBinario arbol = new ArbolBinario();
		ObjectInputStream in = null;
		ListaNotas lista;
		listaNotas.Nodo nodo;

		try {
			in = new ObjectInputStream(new BufferedInputStream(new FileInputStream("listanotas.txt")));

			lista = (ListaNotas) in.readObject();
			nodo = lista.getInicio();
			while (nodo != null) {
				//System.out.println(nodo.toString());
				arbol.insertar(nodo.getNota(), nodo.getNobre(), arbol.raizArbol());
				nodo = nodo.getSiguiente();
			}
			// arbol.insertar(nodo.getNota(), nodo.getNombre(), nodo);

		} finally {
			if (in != null) {
				in.close();
			}
		}

		System.out.println("Inorden:");
		System.out.println("--------------------");
		inorden(arbol.raizArbol());
		System.out.println();
		System.out.println("Preorden:");
		System.out.println("--------------------");
		preorden(arbol.raizArbol());
		System.out.println();
		System.out.println("Postorden:");
		System.out.println("--------------------");
		postorden(arbol.raizArbol());

	}

	public static void preorden(Nodo r) {
		if (r != null) {
			System.out.println(r.toString());
			preorden(r.subarbolIzdo());
			preorden(r.subarbolDcho());
		}
	}

	public static void inorden(Nodo r) {
		if (r != null) {
			inorden(r.subarbolIzdo());
			System.out.println(r.toString());
			inorden(r.subarbolDcho());
		}
	}

	public static void postorden(Nodo r) {
		if (r != null) {
			postorden(r.subarbolIzdo());
			postorden(r.subarbolDcho());
			System.out.println(r.toString());
		}
	}

}
