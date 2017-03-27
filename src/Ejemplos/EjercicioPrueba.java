package Ejemplos;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class EjercicioPrueba {
    public static void main(String[] args) throws IOException {

        FileInputStream in = null;
        FileOutputStream out = null;
        int c, contador=0;

        try {
            in = new FileInputStream("xanadu.txt");
            out = new FileOutputStream("outagain.txt");
           

            while ((c = in.read()) != -1) {
                out.write(c);
                //if(c=='a' || c=='A'){
                //	contador++;
                //}
                if(c>=65 && c<=90){
                	contador++;
                }
            }
        } finally {
            if (in != null) {
                in.close();
            }
            if (out != null) {
                out.close();
            }
            
            System.out.println("Hay " + contador);
        }
    }
}
