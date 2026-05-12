package TrabajoPractico3.SombreroSeleccionador;

import java.util.ArrayList;

public class Alumno {
    private String nombre;
    private ArrayList<String> cualidades;
    private ArrayList<Alumno> familiaresEncuela;
    private boolean tieneCasa;


    public Alumno(String nombre, ArrayList<String> cualidades, ArrayList<Alumno> familiaresEncuela) {
        this.nombre = nombre;
        this.cualidades = cualidades;
        this.familiaresEncuela = familiaresEncuela;
        this.tieneCasa = false;
    }






    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<String> getCualidades() {
        return cualidades;
    }

    public void setCualidades(ArrayList<String> cualidades) {
        this.cualidades = cualidades;
    }

    public ArrayList<Alumno> getFamiliaresEncuela() {
        return familiaresEncuela;
    }

    public void setFamiliaresEncuela(ArrayList<Alumno> familiaresEncuela) {
        this.familiaresEncuela = familiaresEncuela;
    }

    public boolean isTieneCasa() {
        return tieneCasa;
    }

    public void setTieneCasa(boolean tieneCasa) {
        this.tieneCasa = tieneCasa;
    }
}
