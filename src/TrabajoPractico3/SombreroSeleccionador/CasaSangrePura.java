package TrabajoPractico3.SombreroSeleccionador;

import java.util.ArrayList;

public class CasaSangrePura extends Casa {
    public CasaSangrePura (String nombre, ArrayList<String> cualidadesRequisito, int maximoAlumnos) {
        super(nombre, cualidadesRequisito, maximoAlumnos);
    }

    public boolean tieneFamiliar(Alumno alumno) {
        for(Alumno familiarEnEscuela : alumno.getFamiliaresEncuela()){
            if(this.getAlumnos().contains(familiarEnEscuela)){
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean puedeAceptar (Alumno alumno){
        return super.puedeAceptar(alumno) && this.tieneFamiliar(alumno) ;
    }


}
