package biblioteca.com.configuration;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.*;

/**
 *
 * @author Alberto
 */

public class PruebaJson { 
    
    public void leerJson(){
        
        try {
            Object ob = new JSONParser().parse(new FileReader("platos.json"));
        } catch (IOException ex) {
            ex.printStackTrace();
        } catch (ParseException ex) {
            ex.printStackTrace();        
        }
        
    }
}
