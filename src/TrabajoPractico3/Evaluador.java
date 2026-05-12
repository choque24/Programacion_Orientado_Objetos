package TrabajoPractico3;

import java.util.ArrayList;

//Retornando al evaluador y al arraylist de los

public class Evaluador {
    private String nombre;
    private ArrayList<String> temas;

    public Evaluador(String nombre, ArrayList<String> temas) {
        this.nombre = nombre;
        this.temas = temas;
    }

    public boolean conoceTema(String tema) {
        return temas.contains(tema); // Tiene una Complejidad Temporal O(n), puede cambiar a O(1), si utilizo hashmap
    }




    public ArrayList<String> getMaterias() {
        return temas;
    }

    public String getNombre() {
        return nombre;
    }


}
