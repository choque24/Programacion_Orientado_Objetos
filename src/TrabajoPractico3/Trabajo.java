package TrabajoPractico3;

import java.util.ArrayList;

public class Trabajo {
    private String nombre;
    private boolean es_articulo_resumen;
    private ArrayList<String> palabrasClave; //Nos indica los temas que trata el trabajo
    private Evaluador evaluadorAsignado;

    public Trabajo(String nombre, boolean es_articulo_resumen, ArrayList<String> palabrasClave) {
        this.nombre = nombre;
        this.es_articulo_resumen = es_articulo_resumen;
        this.palabrasClave = palabrasClave;
    }


    public boolean esAsignable(ArrayList<String> temas) {

    }


    public ArrayList<String> getPalabrasClave() {
        return palabrasClave;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


}
