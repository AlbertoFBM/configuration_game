package biblioteca.com.configuration;

import com.fasterxml.jackson.databind.MappingIterator;
import com.fasterxml.jackson.databind.ObjectReader;
import com.fasterxml.jackson.databind.ObjectWriter;
import com.fasterxml.jackson.databind.SequenceWriter;
import com.fasterxml.jackson.dataformat.csv.CsvMapper;
import com.fasterxml.jackson.dataformat.csv.CsvSchema;

import java.io.File;
import java.io.IOException;

/**
 *
 * @author David
 * @author Alberto
 * @author Sandra
 */

public class PruebaCSV {
    public void leerCSV(){
        File csvFile = new File("D:\\DAM2\\config\\numeros.csv");
        CsvSchema schema = CsvSchema.emptySchema().withHeader();
        try{
            ObjectReader objectReader = new CsvMapper().readerFor(User.class).with(schema);
            MappingIterator<User> userMappingIterator = objectReader.readValues(csvFile);
            System.out.println(userMappingIterator.readAll());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
