package biblioteca.com.configuration;

/**
 *
 * @author David
 * @author Alberto
 * @author Sandra
 */


import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

public class PruebaJson {

    public void leerJson(){
        // creamos objecto para mapearlo
        ObjectMapper mapper = new ObjectMapper();
        try {
            Plato plato = mapper.readValue(new File("D:\\DAM2\\config\\platos.json"), Plato.class);
            System.out.println(plato);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
