package Unidad1;

public class Ciudad {
    private int imp1, imp2, imp3, imp4, imp5;
    private double [] taxes = {imp1, imp2, imp3, imp4, imp5};
    private String nombre;
    private int dineroGastado;
    private int montoRecaudado;


    //Asumimos que cuando creamos la ciudad sabemos el dinero
    public Ciudad(String nombre, int dineroGastado, int montoRecaudado) {
        this.nombre = nombre;
        this.dineroGastado = dineroGastado;
        this.montoRecaudado = montoRecaudado;
    }

    public boolean estaEnDeficit() {
        return this.dineroGastado >= this.montoRecaudado;
    }




    //Cambian estos atributos?

    public double[] getTaxes() {
        return taxes;
    }

    public void setTaxes(double[] taxes) {
        this.taxes = taxes;
    }

    public String getNombre() {
        return nombre;
    }

    public int getDineroGastado() {
        return dineroGastado;
    }

    public void setDineroGastado(int dineroGastado) {
        this.dineroGastado = dineroGastado;
    }

    public int getMontoRecaudado() {
        return montoRecaudado;
    }

    public void setMontoRecaudado(int montoRecaudado) {
        this.montoRecaudado = montoRecaudado;
    }
}
