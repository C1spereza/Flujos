package Ejemplos;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class EjemploPrueba2 {
    public static void main(String[] args) throws IOException {

        FileReader inputStream = null;
        FileWriter outputStream = null;
        int contador=0;

        try {
            inputStream = new FileReader("xanadu.txt");
            outputStream = new FileWriter("characteroutput.txt");

            int c;
            while ((c = inputStream.read()) != -1) {
                outputStream.write(c);
                if(c=='a' || c=='A'){
                	contador++;
                }
            }
        } finally {
            if (inputStream != null) {
                inputStream.close();
            }
            if (outputStream != null) {
                outputStream.close();
            }
            
            System.out.println("Hay " + contador);
        }
    }
}