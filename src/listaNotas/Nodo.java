package listaNotas;

import java.io.*;

public class Nodo implements Serializable {
	private String nombre;
	private int nota;
	private Nodo siguiente;
	
	public Nodo(String nombre, int nota){
		this.nombre = nombre;
		this.nota	= nota;
		this.siguiente = null;
	}

	public String getNobre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Nodo getSiguiente() {
		return siguiente;
	}
	public void setSiguiente(Nodo siguiente) {
		this.siguiente = siguiente;
	}
	
	public int getNota(){
		return nota;
	}
	
	public void setNota(int nota){
		this.nota=nota;
	}
	
	public boolean esIgual(Nodo n){
		return (nota==n.getNota())? true:false;
	}
	
	public String toString(){
		return  this.nombre + " Nota: " + Double.toString(nota) + "\n";
	}
}
