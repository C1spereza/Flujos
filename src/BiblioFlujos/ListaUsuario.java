package BiblioFlujos;

public class ListaUsuario {
	private NodoUsuario n;
	private Usuario usuario;
	
	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public ListaUsuario(){
		this.usuario=null;
		this.n=null;
	}
	
	public ListaUsuario(Usuario usuario){
		this.usuario=usuario;
		this.n=null;
	}
	
	public void insertar(Usuario usuario){
		NodoUsuario aux=n;
		if(n==null){
			n=new NodoUsuario(usuario);
		}else{
			while(aux.getSiguiente()!=null){
				aux=aux.getSiguiente();
			}
			aux.setSiguiente(new NodoUsuario(usuario));
		}
	}

}
