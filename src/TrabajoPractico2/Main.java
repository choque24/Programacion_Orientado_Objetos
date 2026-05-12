package TrabajoPractico2;

public class Main {
    public static void main(String[] args) {
        Producto productoBasico = new Producto("20 de Mayo", 10);
        Producto productoCongeladoBro = new ProductoCongelado("30 de Mayo",3, "2027", 1, "Los Abuelos", 25 );


        System.out.println(productoBasico.getEtiqueta());
        System.out.println(productoBasico);
        System.out.println(productoBasico.getNroLote());

        System.out.println(productoCongeladoBro.getEtiqueta());



    }
}
