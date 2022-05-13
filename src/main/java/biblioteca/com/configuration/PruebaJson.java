package biblioteca.com.configuration;

/**
 *
 * @author David
 */

//Trabajamos con la biblioteca GSON que es de Google y que nos permitirá serializar archivos JSON de una manera sencilla.

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class PruebaJson {
    private final Scanner scanner = new Scanner(System.in);
    
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
    
    public void escribirJSON(){
        
        Player player1 = new Player();
        System.out.println("Id del jugador: ");
        int x = scanner.nextInt();
        scanner.nextLine();
        player1.setId(x);
        
        System.out.println("Nombre del jugador: ");
        String name = scanner.next();
        player1.setNombre(name);
        
        System.out.println("Puntuación del jugador: ");
        int y = scanner.nextInt();
        player1.setPuntiacion(y);
        
        //Convertir el jugador a JSON:
        
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        String jsonString = gson.toJson(player1);
        System.out.println(jsonString);
        
        //Guardar JSON en un fichero
        try (PrintWriter pw = new PrintWriter(new File("C:\\Users\\David\\Desktop\\PruebaGitKraken\\Configuration\\src\\main\\java\\biblioteca\\com\\configuration\\Player.json"))){
            pw.write(jsonString);
            pw.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
