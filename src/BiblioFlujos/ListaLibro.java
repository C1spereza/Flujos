package BiblioFlujos;

public class ListaLibro {
	private NodoLibro n;
	private Libro libro;
	
	public ListaLibro(){
		this.libro=null;
		this.n=null;
	}
	
	public ListaLibro(Libro libro){
		this.libro=libro;
		this.n=null;
	}
	
	public void insertar(Libro libro){
		NodoLibro aux=n;
		if(n==null){
			n=new NodoLibro(libro);
		}else{
			while(aux.getSiguiente()!=null){
				aux=aux.getSiguiente();
			}
			aux.setSiguiente(new NodoLibro(libro));
		}
	}
	
	public ListaLibro listaLibros(ListaLibro lista, String titulo){
		NodoLibro aux=n;
		if(n==null){
			return lista;
		}else{
			while(aux!=null){
				if(titulo.compareTo(aux.getLibro().getTitulo())==0){
					lista.insertar(aux.getLibro());
				}
				aux=aux.getSiguiente();
			}
			return lista;
		}
	}
	
	public boolean buscar(NodoLibro libro){
		int contador = 1;
		NodoLibro aux=n;
		boolean encontrado = false;
		while(aux!=null && !encontrado){
			aux = aux.getSiguiente();
			contador++;
		}
		if(aux==libro){
			return true;
		}else{
			return false;
		}		
	}

}
