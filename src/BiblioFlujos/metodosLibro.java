package BiblioFlujos;

public class metodosLibro {
	
	
	public boolean prestamo(Libro libro, Usuario usuario){
		if(libro.getPrestado()==false){
			libro.setPrestado(true);
			libro.insertar(usuario);
			usuario.insertar(libro);
			return true;
		}else{
			return false;
		}
	}

}
