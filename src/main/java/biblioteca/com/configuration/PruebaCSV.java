package biblioteca.com.configuration;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Alberto
 */
public class PruebaCSV {

    private final Scanner sc = new Scanner(System.in);

    public void chooseCSV() {
        System.out.println("1.Ejemplo sencillo");
        System.out.println("2.Ejemplo complejo");
        System.out.println("Opción: ");

        int opcion = sc.nextInt();
        sc.nextLine();

        switch (opcion) {
            case 1:
                readSimpleCSV();
                break;
            case 2:
                readComplexCSV();
                break;
            default:
                throw new AssertionError();
        }
    }

    //http://chuwiki.chuidiang.org/index.php?title=Leer_fichero_CSV_con_Java#Leer_fichero_CSV_complejo
    public void readSimpleCSV() {

        final String SEPARATOR = ";";
        final String QUOTE = "\"";

        BufferedReader br = null;

        try {

            br = new BufferedReader(new FileReader("numeros.csv"));

            String line = br.readLine();

            while (line != null) {
                String[] casillas = line.split(SEPARATOR);
                
                String[] aux = new String[casillas.length];

                for (int i = 0; i < aux.length; i++) {
                    aux[i] = casillas[i].replaceAll("^" + QUOTE, "").replaceAll(QUOTE + "$", "");
                }
                casillas = aux;
                System.out.println(Arrays.toString(casillas));

                line = br.readLine();
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
            }
        }
    }

    public void readComplexCSV() {

    }
}
