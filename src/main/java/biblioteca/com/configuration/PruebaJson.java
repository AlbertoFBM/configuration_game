package biblioteca.com.configuration;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author David
 */

//Podemos trabajar con la biblioteca GSON que es de Google y que nos permitirá


import java.io.FileNotFoundException;
import java.io.FileReader;

public class PruebaJson {
    public void LeerJson() throws FileNotFoundException{
//        JSONParser parser = new JSONParser();
        FileReader reader = new FileReader("src/main/java/biblioteca/com/configuration/platos.json");
    }
}
