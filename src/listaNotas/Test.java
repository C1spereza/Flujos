package listaNotas;

import java.io.*;

public class Test {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		ListaNotas lista = new ListaNotas();
		String alumnos = "", notas;
		int i;
		ObjectOutputStream out = null;
		BufferedReader inputStream = null;
		BufferedReader inputStream2 = null;

		try {
			inputStream = new BufferedReader(new FileReader("notas.txt"));
			inputStream2 = new BufferedReader(new FileReader("alumnos.txt"));
			out = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream("listanotas.txt")));

			while ((notas = inputStream.readLine()) != null && (alumnos = inputStream2.readLine()) != null) {
				lista.insertarFinal(new Nodo(alumnos, Integer.parseInt(notas)));
			}

			System.out.println(lista.toString());

			out.writeObject(lista);

		} finally {
			if (inputStream != null) {
				inputStream.close();
			}
			if (inputStream2 != null) {
				inputStream2.close();
			}

			out.close();
		}
	}

}
