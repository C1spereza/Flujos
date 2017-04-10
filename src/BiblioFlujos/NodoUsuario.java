package BiblioFlujos;

public class NodoUsuario {
	private Usuario usuario;
	private NodoUsuario siguiente;
	
	public NodoUsuario(Usuario usuario){
		this.usuario=usuario;
		this.siguiente=null;
	}
	
	public NodoUsuario(){
		usuario=null;
		siguiente=null;
	}
	
	public NodoUsuario getSiguiente(){
		return this.siguiente;
	}
	
	public void setSiguiente(NodoUsuario siguiente){
		this.siguiente = siguiente;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}


}
