package BiblioFlujos;

public class Usuario {
	private String nombre;
	private int tlf;
	private int dni;
	private ListaLibro lista;

	
	public ListaLibro getLista() {
		return lista;
	}

	public void setLista(ListaLibro lista) {
		this.lista = lista;
	}

	public Usuario(){
		this.nombre = "";
		this.tlf = 0;
		this.dni = 0;
		this.lista=new ListaLibro();
	}
	
	public Usuario(String nombre, int dni, int tlf){
		this.nombre = nombre;
		this.dni = dni;
		this.tlf = tlf;
		this.lista=new ListaLibro();
	}
	
	public void setNombre(String nombre){
		this.nombre= nombre;
	}
	
	public String getNombre(){
		return this.nombre;
	}
	
	public void setTlf(int tlf){
		this.tlf = tlf;
	}
	
	public int getTlf(){
		return this.tlf;
	}
	
	public void setDni(int dni){
		this.dni = dni;
	}
	
	public int getDni(){
		return this.dni;
	}
	
	
	
	public String toString(){
		return "Nombre: \t\t\t\t" + nombre + "\n"
		+ "Teléfono: \t\t\t" + tlf + "\n" + 
		"DNI: \t\t\t\t" + dni + "\n"; 
	}
	
	public void prestar(Libro libro){
		lista.insertar(libro);
	}

}
