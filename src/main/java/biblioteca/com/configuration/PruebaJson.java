package biblioteca.com.configuration;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.*;

/**
 *
 * @author Alberto
 */
public class PruebaJson {

    private final Scanner scanner = new Scanner(System.in);

    public void chooseOption(int option){
        switch(option){
            case 1: 
                readJson();
                break;
            case 2:
                writeJson();
                break;
            default:
                System.out.println("Escribe una opción correcta");
        }
    }

    public void readJson() {

        System.out.println("LECTURA DE JSON:\n");
        
        try {
            
            System.out.println("Lectura de elementos simples:\n");
            JSONParser parser = new JSONParser();
            Object object = parser.parse(new FileReader("platos.json"));

            JSONObject config = (JSONObject) object;

            String pepito = (String) config.get("pepito");
            System.out.println(pepito);

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
            System.out.println("Excepcion leyendo fichero de configuracion ");
            e.printStackTrace();
        }
    }

    public void writeJson(){
    

        JSONObject json = new JSONObject();
        json.put("pepito", "grillo");
        json.put("verb", "HTTPPUTA");
        json.put("host", "11111");
        json.put("port", "8001");
        json.put("method", "API/PROJECTS");

        JSONObject iJsonObject = new JSONObject();
        iJsonObject.put("nombre", "Pepito");
        iJsonObject.put("precio", 2000);
        iJsonObject.put("duracion", 8);
        iJsonObject.put("tamano", "medio");


        JSONArray list = new JSONArray();
        list.add(iJsonObject);
        json.put("PlatoFuerte", list);

        try {
            // Para sobreescribir el fichero hay que añadir 'true' como segundo parámetro.
            FileWriter file = new FileWriter("platos.json");
            file.write(json.toJSONString());
            file.flush();
            file.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("Se ha sobreescrito el archivo JSON");
        System.out.println("Se ha escrito: " + json);

        System.out.println("\n Te gustaría leer el JSON? \n");
        int yesNo = scanner.nextInt();

        switch(yesNo){
            case 1:
                readJson();
                break;
            case 2:
                break;
            default:
                break;
        }
    }
}
