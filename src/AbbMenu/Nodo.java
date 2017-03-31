package AbbMenu;

import java.io.Serializable;

public class Nodo implements Serializable {
	private String nombre;
	private int nota;
	protected Nodo izdo;
	protected Nodo dcho;
	private Nodo siguiente;
	
	public Nodo(){
		
	}
	
	public Nodo(String nombre, int nota){
		this.nombre = nombre;
		this.nota = nota;
		izdo = null;
		dcho = null;
	}
	
	public Nodo(String nombre, int nota, Nodo izdo, Nodo dcho){
		this.nombre = nombre;
		this.nota	= nota;
		this.siguiente = null;
		this.izdo = izdo;
		this.dcho = dcho;
	}
	
	public String valorNodo() {
		return nombre;
	}
	
	public Nodo subarbolIzdo() {
		return izdo;
	}

	public Nodo subarbolDcho() {
		return dcho;
	}
	
	public void ramaIzdo(Nodo n) {
		izdo = n;
	}

	public void ramaDcho(Nodo n) {
		dcho = n;
	}

	public String getNombre() {
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
