package ABBNotas;

public class ArbolBinario {
	private Nodo raiz;


	public ArbolBinario() {
		raiz = null;
	}

	public ArbolBinario(Nodo izq, Nodo raiz, Nodo der) {
		this.raiz = raiz;
	}

	public Nodo raizArbol() {
		return raiz;
	}

	// Comprueba el estatus del árbol
	boolean esVacio() {
		return raiz == null;
	}

	public void insertar(int dato, String nombre, Nodo n) {
		if (n == null)
			raiz = new Nodo(nombre, dato);
		else {
			if (nombre.compareTo(n.valorNodo())>=0) {
				if (n.subarbolDcho() != null) {
					insertar(dato, nombre,  n.subarbolDcho());
				} else {
					n.ramaDcho(new Nodo(nombre, dato));
				}
			} else {
				if (n.subarbolIzdo() != null) {
					insertar(dato, nombre,  n.subarbolIzdo());
				} else {
					n.ramaIzdo(new Nodo(nombre, dato));
				}
			}
		}
		// return new Nodo(ramaIzqda, dato, ramaDrcha);
	}
}