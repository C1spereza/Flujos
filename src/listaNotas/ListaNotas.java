package listaNotas;

import java.io.Serializable;

public class ListaNotas implements Serializable{
	private Nodo inicio;
	private int tamaño;

	public ListaNotas() {
		inicio = null;
		tamaño = 0;
	}

	public Nodo getInicio() {
		return inicio;
	}

	public void setInicio(Nodo inicio) {
		this.inicio = inicio;
	}

	public int getTamaño() {
		return tamaño;
	}

	public void setTamaño(int tamaño) {
		this.tamaño = tamaño;
	}

	public String toString() {
		String salida = "La lista contiene: \n";
		Nodo auxiliar = inicio;
		while (auxiliar != null) {
			salida = salida + auxiliar.toString() + "";
			auxiliar = auxiliar.getSiguiente();
		}
		salida = salida + "\nLa lista tiene " + tamaño + " elementos";
		return salida;
	}

	public void insertarInicio(Nodo n) {
		n.setSiguiente(inicio);
		inicio = n;
		tamaño++;

	}

	public void insertarFinal(Nodo nodo) {
		if (inicio == null)
			insertarInicio(nodo);
		else {
			Nodo actual = inicio;
			while (actual.getSiguiente() != null) {
				actual = actual.getSiguiente();
			}
			actual.setSiguiente(nodo);
			this.tamaño++;
		}
	}

	public boolean insertar(Nodo nodo, int posicion) {
		if (posicion > this.tamaño + 1 || posicion < 1) {
			return false;
		} else {
			if (posicion == 1)
				insertarInicio(nodo);
			else if (posicion == tamaño + 1)
				insertarFinal(nodo);
			else {
				Nodo nodoAuxiliar = inicio.getSiguiente();
				Nodo nodoAnterior = inicio;
				posicion = posicion - 2;
				while (posicion > 0) {
					nodoAnterior = nodoAuxiliar;
					nodoAuxiliar = nodoAuxiliar.getSiguiente();
					posicion--;
				}
				nodo.setSiguiente(nodoAuxiliar);
				nodoAnterior.setSiguiente(nodo);
				this.tamaño++;
			}
			return true;
		}
	}

	public boolean eliminarPrimero() {
		if (inicio == null)
			return false;
		else {
			inicio = inicio.getSiguiente();
			tamaño--;
			return true;
		}
	}

	public boolean eliminarUltimo() {
		if (inicio == null)
			return false;
		else {
			if (tamaño == 1)
				inicio = null;
			else {
				Nodo nodoAuxiliar = inicio;
				int posicionAuxiliar = 1;
				while (posicionAuxiliar < this.tamaño - 1) {
					nodoAuxiliar = nodoAuxiliar.getSiguiente();
					posicionAuxiliar++;
				}
				nodoAuxiliar.setSiguiente(null);
			}
			tamaño--;
			return true;
		}

	}

	public boolean eliminar(int posicion) {
		if (posicion <= 0 || posicion > tamaño)
			return false;
		else {
			if (posicion == 1)
				return eliminarPrimero();
			else {
				Nodo nodoAEliminar = inicio.getSiguiente();
				Nodo nodoAnterior = inicio;
				posicion = posicion - 2;
				while (posicion > 0) {
					nodoAnterior = nodoAEliminar;
					nodoAEliminar = nodoAEliminar.getSiguiente();
					posicion--;
				}
				nodoAnterior.setSiguiente(nodoAEliminar.getSiguiente());
				this.tamaño--;
				return true;
			}
		}
	}

	public boolean esVacia() {
		return (tamaño == 0) ? true : false;
	}

	public int buscarPrimero(Nodo n) {
		Nodo auxiliar = this.inicio;
		int posicion = 1;
		boolean encontrado = false;
		while (auxiliar != null && !encontrado) {
			if (auxiliar.esIgual(n)) {
				encontrado = true;
			} else {
				auxiliar = auxiliar.getSiguiente();
				posicion++;
			}
		}
		return (auxiliar == null) ? 0 : posicion;

	}

	/*public ListaNotas buscarTodos(Nodo n) {
		Nodo auxiliar = this.inicio;
		ListaNotas resultado = new ListaNotas();
		int posicion = 1;

		while (auxiliar != null) {
			if (auxiliar.esIgual(n)) {
				resultado.insertarInicio(new Nodo(posicion));
			}
			auxiliar = auxiliar.getSiguiente();
			posicion++;

		}
		return resultado;

	}*/
	/*public void eleminarTodos(Nodo n){
		
		Nodo auxiliar = buscarTodos(n).getInicio();
		while(auxiliar!=null){
			eliminar(auxiliar.getNota());
			auxiliar=auxiliar.getSiguiente();
		}
	}*/
}
