package BiblioFlujos;

public class ListaLibro {
	private NodoLibro n;
	private Libro libro;
	
	public Libro getLibro() {
		return libro;
	}

	public void setLibro(Libro libro) {
		this.libro = libro;
	}

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
	
	/*public boolean eliminarFinal(ListaLibro lista){
		int a;
		NodoLibro b, b1;
		b=n;
		b1 = b.getSiguiente();
		if(b==null){
			return false;
		}else{
			/*a=this.tamaño;
			for(int i=0; i<a-2; i++){
				b=b.getSiguiente();
			}
			b.setSiguiente(null);
			tamaño--;
			while(b1.getSiguiente()!= null){
				b.setSiguiente(b.getSiguiente());
			}
			return false;
		}
	}*/
	
	

}
