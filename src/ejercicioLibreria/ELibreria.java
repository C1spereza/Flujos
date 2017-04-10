package ejercicioLibreria;
import miLibreria.Entrada;

public class ELibreria {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Entrada entrada=new Entrada();
		Libro[] titulos=new Libro[6];
		for(int i=0; i<titulos.length; i++){
			titulos[i]=new Libro();
		}
		int opc;
		int libro, ejemplares, prestados, nuevoejem, i;
		String titulo, autor, nuevotitulo, nuevoautor;
		boolean bucle=true;
		
		do{
			System.out.println("\t Introducir Libro");
			System.out.println("-------------------------------------------");
			System.out.println("1- Introducir libro");
			System.out.println("2- Cambiar titulo del libro");
			System.out.println("3- Cambiar autor del libro");
			System.out.println("4- Cambiar cantidad de ejemplares");
			System.out.println("5- Prestar libro");
			System.out.println("6- Devolver libro");
			System.out.println("7- Consultar libro");
			System.out.println("8- Listado de libros");
			System.out.println("-------------------------------------------");
			System.out.println("0- Salir");
			System.out.println("-------------------------------------------");
			opc=entrada.obtenerEntero("Elija una opcion (1-8)");
			
			switch(opc){
			case 1:
				do{
					menuLibreria(titulos);
				
					libro=entrada.obtenerEntero("¿Que libro quieres introducir?");
					if(libro==0){
						break;
					}
					titulo=entrada.obtenerString("Titulo del libro:");
					autor=entrada.obtenerString("Nombre del autor del libro:");
					ejemplares=entrada.obtenerEntero("Numero de ejemplares disponibles:");
					prestados=entrada.obtenerEntero("Numero de ejemplares prestados:");
				
					titulos[libro-1] = new Libro(autor, titulo, ejemplares, prestados);
					entrada.obtenerString("Pulsa [Intro] para continuar.");
				}while(libro!=0);
				break;
				
			case 2:
				do{
					menuLibreria(titulos);
					
					libro=entrada.obtenerEntero("¿De que libro quieres cambiar el titulo?");
					if(libro==0){
						break;
					}
					nuevotitulo=entrada.obtenerString("Dime el nuevo nombre del libro:");
					
					titulos[libro-1].setTitulo(nuevotitulo);
					System.out.println("Titulo cambiado correctamente");
					entrada.obtenerString("Pulsa [Intro] para continuar.");
					
				}while(libro!=0);
				break;
				
			case 3:
				do{
					menuLibreria(titulos);
					
					libro=entrada.obtenerEntero("¿De que libro quieres cambiar el autor?");
					if(libro==0){
						break;
					}
					nuevoautor=entrada.obtenerString("Dime el nuevo autor del libro:");
					
					titulos[libro-1].setAutor(nuevoautor);
					System.out.println("Autor cambiado correctamente.");
					entrada.obtenerString("Pulsa [Intro] para continuar.");
					
				}while(libro!=0);
				break;
				
			case 4:
				do{
					menuLibreria(titulos);
					
					libro=entrada.obtenerEntero("¿De que libro quieres cambiar el numero de ejemplares?");
					if(libro==0){
						break;
					}
					nuevoejem=entrada.obtenerEntero("Dime el nuevo numero de ejemplares:");
					if(nuevoejem>0){
						System.out.println("Numero cambiado correctamente");
						titulos[libro-1].setNumEjemplares(nuevoejem);
					}else{
						System.out.println("Introduzca un valor entero positivo, por favor.");
					}
					
					entrada.obtenerString("Pulsa [Intro] para continuar.");
					
				}while(libro!=0);
				break;
				
			case 5:
				do{
					menuLibreria(titulos);
					
					libro=entrada.obtenerEntero("¿Que libro quieres coger prestado?");
					if(libro==0){
						break;
					}
					if(titulos[libro-1].prestamo()==true){
						System.out.println("El libro se ha prestado correctamente.");
					}else{
						System.out.println("Lo siento, el libro no esta disponible para ser prestado.");
					}
					entrada.obtenerString("Pulsa [Intro] para continuar.");
					
				}while(libro!=0);
				break;
				
			case 6:
				do{
					menuLibreria(titulos);
					
					libro=entrada.obtenerEntero("¿Que libro quieres devolver?");
					if(libro==0){
						break;
					}
					if(titulos[libro-1].devolucion()==true){
						System.out.println("El libro se ha devuelto correctamente.");
					}else{
						System.out.println("Lo siento, el libro no se puede devolver.");
					}
					entrada.obtenerString("Pulsa [Intro] para continuar.");
					
				}while(libro!=0);
				break;
				
			case 7:
				do{
					menuLibreria(titulos);
					
					libro=entrada.obtenerEntero("¿Que libro quieres consultar?");
					if(libro==0){
						break;
					}
					
					System.out.println("Libro:");
					System.out.println("-----------------------------------------------------------");
					System.out.println(titulos[libro-1].toString());
					
					entrada.obtenerString("Pulsa [Intro] para continuar.");
					
				}while(libro!=0);
				break;
				
			case 8:
				for(i=0; i<titulos.length;i++){
					System.out.println(titulos[i].toString());
					System.out.println("-----------------------------------------------------------");
				}
				entrada.obtenerString("Pulsa [Intro] para continuar.");
				break;
				
			case 0:
				bucle=false;
				break;
			}
		}while(bucle==true);

	}
	
	public static void menuLibreria(Libro[] titulos){
		
		System.out.println("\t Menú de la biblioteca");
		System.out.println("-----------------------------------");
		System.out.println("1- " + titulos[0].getTitulo());
		System.out.println("2- " + titulos[1].getTitulo());
		System.out.println("3- " + titulos[2].getTitulo());
		System.out.println("4- " + titulos[3].getTitulo());
		System.out.println("5- " + titulos[4].getTitulo());
		System.out.println("6- " + titulos[5].getTitulo());
		System.out.println("-----------------------------------");
		System.out.println("0- Salir");
	}

	public static void borrarPantalla(){
		System.out.println("\033[H\033[2J");
		System.out.flush();
	}
}
