package biblioteca.com.configuration;

import com.opencsv.CSVReader;
import com.opencsv.CSVWriter;
import com.opencsv.exceptions.CsvValidationException;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author David
 */

public class PruebaCSV {
    //https://www.campusmvp.es/recursos/post/como-leer-y-escribir-archivos-csv-con-java.aspx
    public void leerCSV(){
        String archCSV = "C:\\Users\\David\\Desktop\\Damage.csv";
        try {
            CSVReader csvReader = new CSVReader ( new FileReader(archCSV));
            String []fila = null;
            while ((fila = csvReader.readNext())!= null){
                System.out.println(fila[0]+" , " +
                        fila[1]+" , "+
                        fila[2]+" , "+
                        fila[3]+" ");
            };
        } catch (FileNotFoundException ex) {
            Logger.getLogger(PruebaCSV.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(PruebaCSV.class.getName()).log(Level.SEVERE, null, ex);
        } catch (CsvValidationException ex) {
            Logger.getLogger(PruebaCSV.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void escribirCSV (){
        //Los datos nos los pasarán o bien los obtendremos de una BBDD, no sé muy bien cómo será.
        //En este caso los metemos a Mano.
        ArrayList <String[]> jugadores = new ArrayList<String[]>();
        jugadores.add(new String[]{"David", "DAV", "1"});
        jugadores.add(new String[]{"Alberto", "ALB", "2"});
        jugadores.add(new String[]{"Sandra", "SAN", "3"});
        
        //String archCSV = "C:\\Users\\David\\Desktop\\PruebaGitKraken\\Configuration\\src\\main\\java\\biblioteca\\com\\configuration\\Player.csv";
        String archCSV = "C:\\Users\\David\\Desktop\\Player.csv";
        try {
            CSVWriter writer = new CSVWriter(new FileWriter(archCSV));
            writer.writeAll(jugadores);
            writer.close();
        } catch (IOException ex) {
            Logger.getLogger(PruebaCSV.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
