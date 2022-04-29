package biblioteca.com.configuration;

import java.io.FileReader;
import java.io.IOException;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.*;

/**
 *
 * @author Alberto
 */
public class PruebaJson {

    public void readJson() {

        System.out.println("LECTURA DE JSON:\n");
        
        try {
            
            System.out.println("Lectura de elementos simples:\n");
            JSONParser parser = new JSONParser();
            Object object = parser.parse(new FileReader("platos.json"));

            JSONObject config = (JSONObject) object;

            String verb = (String) config.get("verb");
            System.out.println(verb);

            String host = (String) config.get("host");
            System.out.println(host);

            String port = (String) config.get("port");
            System.out.println(port);

            String method = (String) config.get("method");
            System.out.println(method + "\n");
            
            System.out.println("Lectura de un array:\n");
            
            JSONArray arr = (JSONArray) config.get("PlatoFuerte");
            
            for (int i = 0; i < arr.size(); i++) {
                JSONObject j = (JSONObject) arr.get(i);
                
                String precio = j.get("precio").toString();
                System.out.println(precio);
                
                String duracion = j.get("duracion").toString();
                System.out.println(duracion);
                
                String nombre = (String) j.get("nombre");
                System.out.println(nombre);
                
                String tamano = (String) j.get("tamano");
                System.out.println(tamano + "\n");
                
            }
        } catch (Exception e) {
            System.out.println("Excepcion leyendo fichero de configuracion " + e);
        }

//        try(FileReader reader = new FileReader("platos.json")){
//            
//            Object obj = new JSONParser().parse(reader);
//            
//            JSONObject js = (JSONObject) obj;
//            
//            System.out.println("El archivo contiene el siguiente JSON: ");
//            System.out.println(obj);
//            System.out.println(js);
//
//            JSONArray arr = (JSONArray) js.get("PlatoFuerte");  
//            
//            for(int i =0; i<arr.size(); i++){
//                
//                JSONObject elemento = (JSONObject) arr.get(i);
//                String nombre = elemento.toString();
//                System.out.println(nombre);
//                
//            }  
//
//        }catch(IOException | ParseException ex){
//            ex.printStackTrace();
//        }
    }
}
