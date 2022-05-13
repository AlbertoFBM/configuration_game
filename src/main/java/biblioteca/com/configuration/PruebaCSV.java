package biblioteca.com.configuration;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
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
}
