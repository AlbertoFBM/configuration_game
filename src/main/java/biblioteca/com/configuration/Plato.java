/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biblioteca.com.configuration;

/**
 *
 * @author David
 */
public class Plato {
    private String nombre;
    private int precio;
    private int duracion;
    private String tipo;
    
    public Plato(){
        
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public String getTamaño() {
        return tipo;
    }

    public void setTamaño(String tamaño) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Plato{" + "nombre=" + nombre + ", precio=" + precio + ", duracion=" + duracion + ", tipo=" + tipo + '}';
    }
    
}
