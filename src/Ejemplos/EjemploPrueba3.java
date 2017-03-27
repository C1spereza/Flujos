package Ejemplos;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.PrintWriter;
import java.io.IOException;

public class EjemploPrueba3 {
    public static void main(String[] args) throws IOException {

        BufferedReader inputStream = null;
        String [] vector = new String[4];
        int contador=0, i, cont=0;

        try {
            inputStream = new BufferedReader(new FileReader("nombres.txt"));

            String l;
            while ((l = inputStream.readLine()) != null) {
                vector[contador]=l;
                contador++;
                //l.toCharArray();
                for(i=0; i<l.length(); i++){
                	if(l.toCharArray()[i]>=65 && l.toCharArray()[i]<=90){
                		cont++;
                	}
                }
            }
            for(i=0; i<vector.length; i++){
            	System.out.println(vector[i]);
            }
            System.out.println("Hay " + cont);
        } finally {
            if (inputStream != null) {
                inputStream.close();
            }
        }
    }
}
