package BiblioFlujos;
import java.io.*;

public class NodoLibro implements Serializable{
	private Libro libro;
	private NodoLibro siguiente;
	
	public NodoLibro(Libro libro){
		this.libro=libro;
		this.siguiente=null;
	}
	
	public NodoLibro(){
		libro=null;
		siguiente=null;
	}
	
	public NodoLibro getSiguiente(){
		return this.siguiente;
	}
	
	public void setSiguiente(NodoLibro siguiente){
		this.siguiente = siguiente;
	}

	public Libro getLibro() {
		return libro;
	}

	public void setLibro(Libro libro) {
		this.libro = libro;
	}

}
