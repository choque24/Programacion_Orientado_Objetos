package Unidad1;

public class Electrodomestico {
    private static final double CONSUMO_LIMITE = 45;
    private static final double CONSUMO_DEFAULT = 10;


    private String nombre;
    private double consumo;

    public Electrodomestico(String nombre, double consumno) {
        this.nombre = nombre;
        this.consumo = consumno;
    }

    public Electrodomestico(String nombre) {
        this(nombre, CONSUMO_DEFAULT);
    }

    public boolean bajoConsumo(){
        return this.consumo <= CONSUMO_LIMITE;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getConsumo() {
        return consumo;
    }

    public void setConsumo(double consumo) {
        this.consumo = consumo;
    }
}
