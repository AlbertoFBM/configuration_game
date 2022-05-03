package biblioteca.com.configuration;

/**
 *
 * @author David
 */

//Trabajamos con la biblioteca GSON que es de Google y que nos permitirá serializar archivos JSON de una manera sencilla.

import com.google.gson.Gson;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class PruebaJson {
    
    public void leerJson(){
        String json = "";
        try (BufferedReader br = new BufferedReader(new FileReader("src/main/java/biblioteca/com/configuration/platos.json"))){
            String linea;
            while ((linea = br.readLine()) != null) {
                json += linea;
            }
            br.close();
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            Logger.getLogger(PruebaJson.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        System.out.println(json);
        
        Gson gson = new Gson();
        Plato p = gson.fromJson(json, Plato.class);
        System.out.println(p);
    }
}
