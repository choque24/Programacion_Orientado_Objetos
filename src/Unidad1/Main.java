package Unidad1;

public class Main {
    public static void main(String[] args) {
        Electrodomestico microondas = new Electrodomestico("Heladera");
        System.out.println(microondas.getConsumo());
        boolean esBajoConsumo = microondas.bajoConsumo();
        System.out.println(esBajoConsumo);
    }
}
