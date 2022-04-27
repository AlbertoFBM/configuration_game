package biblioteca.com.configuration;

/**
 *
 * @author David
 * @author Alberto
 * @author Sandra
 */

//Podemos trabajar con la biblioteca GSON que es de Google y que nos permitirá

import java.io.FileNotFoundException;
import java.io.FileReader; 

public class PruebaJson {
    
    public void leerJson(){
        try {
            //        JSONParser parser = new JSONParser();
            FileReader reader = new FileReader("src/main/java/biblioteca/com/configuration/platos.json");
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        }
    }
}
