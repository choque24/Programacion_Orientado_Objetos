package TrabajoPractico4.SistemaAlquiler;

public class Pelicula extends Item{
    String nombre;
    String informacionFilmografica;
    int copiasDisponibles;

    public Pelicula (String nombre, String informacionFilmografica, int copiasDisponibles){
        this.nombre = nombre;
        this.informacionFilmografica = informacionFilmografica;
        this.copiasDisponibles = copiasDisponibles;
    }

    @Override
    public boolean puedeSerAlquilado(){
        return false;
    }

    //Getters

}
