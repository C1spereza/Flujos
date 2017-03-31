package ABB;

public class ArbolBinario {
	private Nodo raiz;
	private Nodo izq;
	private Nodo der;

	public ArbolBinario() {
		raiz = null;
		izq = null;
		der = null;
	}

	public ArbolBinario(Nodo izq, Nodo raiz, Nodo der) {
		this.izq = izq;
		this.raiz = raiz;
		this.der = der;
	}

	public Nodo raizArbol() {
		return raiz;
	}

	// Comprueba el estatus del árbol
	boolean esVacio() {
		return raiz == null;
	}

	public void insertar(int dato, Nodo n) {
		if (n == null)
			raiz = new Nodo(dato);
		else {
			if (dato > n.valorNodo()) {
				if (n.subarbolDcho() != null) {
					insertar(dato, n.subarbolDcho());
				} else {
					n.ramaDcho(new Nodo(dato));
				}
			} else {
				if (n.subarbolIzdo() != null) {
					insertar(dato, n.subarbolIzdo());
				} else {
					n.ramaIzdo(new Nodo(dato));
				}
			}
		}
		// return new Nodo(ramaIzqda, dato, ramaDrcha);
	}
}
