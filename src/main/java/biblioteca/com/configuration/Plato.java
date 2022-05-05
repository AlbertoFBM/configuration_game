package biblioteca.com.configuration;

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

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Plato{" + "nombre=" + nombre + ", precio=" + precio + ", duracion=" + duracion + ", tipo=" + tipo + '}';
    }

}