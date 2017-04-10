package BiblioFlujos;

public class metodosLibro {
	
	
	public boolean prestamo(Libro libro, Usuario usuario){
		if(libro.getPrestado()==false){
			libro.prestar(usuario);
			usuario.prestar(libro);
			return true;
		}else{
			return false;
		}
	}

}
