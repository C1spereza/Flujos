package BiblioFlujos;

public class Libro {
	private static int ejemplares=0;
	private String autor;
	private String titulo;
	private int isbn;
	private int codEjemplar;
	private boolean prestado;
	private ListaUsuario listausuario;

	
	public int getCodEjemplar() {
		return codEjemplar;
	}

	public void setCodEjemplar(int codEjemplar) {
		this.codEjemplar = codEjemplar;
	}

	public ListaUsuario getListausuario() {
		return listausuario;
	}

	public void setListausuario(ListaUsuario listausuario) {
		this.listausuario = listausuario;
	}

	public Libro(){
		this.autor="";
		this.titulo="";
		this.listausuario = new ListaUsuario();
		this.isbn = 0;
		this.prestado=false;
		codEjemplar=ejemplares;
		ejemplares++;
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
	
	
	
/*	public boolean devolucion(){
		if(this.numPrestados>0){
			numPrestados--;
			return true;
		}else{
			return false;
		}
	}*/
	
	public String toString(){
		return "Autor: \t\t\t\t" + autor + "\n"
		+ "Titulo: \t\t\t" + titulo + "\n"
		+ "ISBN: \t\t\t\t" + isbn + " - " + codEjemplar; 
	}
	
	public void prestar(Usuario usuario){
		listausuario.insertar(usuario);
		prestado=true;
	}
	
	public void devolver(Usuario usuario){
		prestado=false;
	}


}
