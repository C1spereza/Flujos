package BiblioFlujos;

public class Libro {
	private String autor;
	private String titulo;
	private int isbn;
	private int ejemplares=0;
	private boolean prestado;
	private ListaUsuario listausuario;
	private NodoLibro inicio = null;
	private NodoUsuario usuarios = null;
	
	public Libro(){
		this.autor="";
		this.titulo="";
		this.listausuario = new ListaUsuario();
		this.isbn = 0;
		this.prestado=false;
	}
	
	public Libro(String autor, String titulo, int isbn){
		this.autor=autor;
		this.titulo=titulo;
		this.ejemplares= ejemplares;
		this.listausuario = new ListaUsuario();
		this.isbn = isbn;
		this.prestado=false;
		ejemplares++;
	}
	
	public int getEjemplares() {
		return ejemplares;
	}

	public void setEjemplares(int ejemplares) {
		this.ejemplares = ejemplares;
	}

	public boolean getPrestado() {
		return prestado;
	}

	public void setPrestado(boolean prestado) {
		this.prestado = prestado;
	}

	public void setAutor(String autor){
		this.autor=autor;
	}
	
	public void setTitulo(String titulo){
		this.titulo=titulo;
	}

	public String getAutor(){
		return autor;
	}
	
	public String getTitulo(){
		return titulo;
	}
	
	public int getEjemplar(){
		return ejemplares;
	}
	
	public boolean eliminarFinal(){
		int a;
		NodoLibro b, b1;
		b=inicio;
		b1 = b.getSiguiente();
		if(inicio==null){
			return false;
		}else{
			/*a=this.tamaño;
			for(int i=0; i<a-2; i++){
				b=b.getSiguiente();
			}
			b.setSiguiente(null);
			tamaño--;*/
			while(b1.getSiguiente()!= null){
				b.setSiguiente(b.getSiguiente());
			}
			return false;
		}
	}
	
	public void insertar(Usuario usuario){
		NodoUsuario aux=usuarios;
		if(usuarios==null){
			usuarios=new NodoUsuario(usuario);
		}else{
			while(aux.getSiguiente()!=null){
				aux=aux.getSiguiente();
			}
			aux.setSiguiente(new NodoUsuario(usuario));
		}
	}
	
/*	public boolean prestamo(){
		if(this.numPrestados<this.numEjemplares){
			numPrestados++;
			return true;
		}else{
			return false;
		}
	}
	
	public boolean devolucion(){
		if(this.numPrestados>0){
			numPrestados--;
			return true;
		}else{
			return false;
		}
	}*/
	
	public String toString(){
		return "Autor: \t\t\t\t" + autor + "\n"
		+ "Titulo: \t\t\t" + titulo + "\n"; 
	}


}
