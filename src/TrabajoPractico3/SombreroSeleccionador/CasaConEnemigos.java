package TrabajoPractico3.SombreroSeleccionador;

import java.util.ArrayList;

public class CasaConEnemigos extends Casa {
    private ArrayList<Casa> casasEnemigas;

    public CasaConEnemigos (String nombre, ArrayList<String> cualidadesRequisito, int maximoAlumnos, ArrayList<Casa> casasEnemigas) {
        super(nombre, cualidadesRequisito, maximoAlumnos);
        this.casasEnemigas = casasEnemigas;
    }

    public

    @Override
    public boolean puedeAceptar (Alumno alumno){
        if(this.getCantidadAlumnos() >= this.getMaximoAlumnos()) {
            return false;
        }

        for(Casa casaEnemiga : casasEnemigas) {
            if(casaEnemiga.puedeAceptar(alumno)) {
                return false;
            }
        }

        //Por cada CualidadRequisito de mi Casa, pregunto si esta en las cualidades del alumno
        for(String cualidadRequisito : this.getCualidadesRequisito()) {
            if(!alumno.getCualidades().contains(cualidadRequisito)) {
                return false;
            }
        }
        return true;
    }

    public ArrayList<Casa> getCasasEnemigas() {
        return casasEnemigas;
    }

    public void setCasasEnemigas(ArrayList<Casa> casasEnemigas) {
        this.casasEnemigas = casasEnemigas;
    }


}
