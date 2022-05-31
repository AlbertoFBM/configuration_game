package biblioteca.com.configuration;

/**
 *
 * @author David
 * @author Alberto
 * @author Sandra
 */


import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import javax.swing.plaf.metal.MetalIconFactory;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class PruebaJson {

    public void leerJson() {
        // convertimos objeto a JSON gracias a objectMapper, instaciamos el mapper
        ObjectMapper mapper = new ObjectMapper();
        try {
            String json = mapper.writeValueAsString(listaPlatos());
            List<Plato> platos = mapper.readValue(json, new TypeReference<List<Plato>>() {});
            //creo archivo json con la lista de platos
            mapper.writeValue(new File("D:\\DAM2\\config\\platos.json"), platos);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        //printeamos la lista de platos creada
        listaPlatos().forEach(System.out::println);
    }
    //añadimos platos a una lista
    private static List<Plato> listaPlatos() {
        Plato plato1 = new Plato();
        plato1.setNombre("Pizza");
        plato1.setPrecio(9);
        plato1.setDuracion(30);
        plato1.setTipo("una porcion");

        Plato plato2 = new Plato();
        plato2.setNombre("Hamburguesa");
        plato2.setPrecio(12);
        plato2.setDuracion(30);
        plato2.setTipo("una");

        return Arrays.asList(plato1, plato2);
    }
}
