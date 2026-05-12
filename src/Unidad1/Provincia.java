package Unidad1;
//Sistema de Control de Gastos Públicos
//Un país tiene que controlar el gasto público de las ciudades con más de 100.000
//habitantes. Para ello, tiene información del monto recaudado por cada ciudad a través de
//cinco diferentes tipos de impuestos (denominados, aquí, de imp1, imp2, imp3, imp4 e
//imp5) e información acerca de gastos realizados en mantenimiento de la ciudad.

//Este país necesita un sistema que le informe:
// cuales son las ciudades que gastan más de lo que recaudan
// y las provincias que tienen más de la mitad de las ciudades en condición de déficit.

// Tener en cuenta la delegación de responsabilidades a la hora de plantear la solución. Implementar en java
public class Provincia {
    private static final int MAX_CIUDAD = 100;
    private String nombre;
    private Ciudad [] ciudades;

    public Provincia(String nombre, Ciudad[] ciudades) {
        this.nombre = nombre;
        this.ciudades = ciudades;
    }

    public String getNombre() {
        return nombre;
    }

    public Ciudad[] getCiudades() {
        return ciudades;
    }

}
