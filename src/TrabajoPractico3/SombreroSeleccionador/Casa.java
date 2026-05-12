package TrabajoPractico3.SombreroSeleccionador;

import java.util.ArrayList;

public class Casa {
    private String nombre;
    private ArrayList<String> cualidadesRequisito;
    private int maximoAlumnos;
    private int cantidadAlumnos;
    private ArrayList<Alumno> alumnos;
    //

    public Casa (String nombre, ArrayList<String> cualidadesRequisito, int maximoAlumnos) {
        this.nombre = nombre;
        this.cualidadesRequisito = new ArrayList<>();
        this.maximoAlumnos = maximoAlumnos;
        this.cantidadAlumnos = 0;
        this.alumnos = new ArrayList<>();
    }

    public void agregarAlumno(Alumno alumno) {
        if(puedeAceptar(alumno)) {
            alumno.setTieneCasa(true);
            alumnos.add(alumno);
            cantidadAlumnos++;
        }
    }

    public boolean puedeAceptar(Alumno alumno) {
        if(cantidadAlumnos >= maximoAlumnos) {
            return false;
        }

        //Por cada CualidadRequisito de mi Casa, pregunto si esta en las cualidades del alumno
        for(String cualidadRequisito : this.cualidadesRequisito) {
            if(!alumno.getCualidades().contains(cualidadRequisito)) {
                return false;
            }
        }
        return true;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<String> getCualidadesRequisito() {
        return cualidadesRequisito;
    }

    public void setCualidadesRequisito(ArrayList<String> cualidadesRequisito) {
        this.cualidadesRequisito = cualidadesRequisito;
    }

    public int getMaximoAlumnos() {
        return maximoAlumnos;
    }

    public void setMaximoAlumnos(int maximoAlumnos) {
        this.maximoAlumnos = maximoAlumnos;
    }

    public int getCantidadAlumnos() {
        return cantidadAlumnos;
    }

    public ArrayList<Alumno> getAlumnos() {
        return alumnos;
    }

}
