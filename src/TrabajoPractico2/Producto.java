package TrabajoPractico2;

public class Producto {
    private String fecha_vencimiento;
    private int nroLote;

    //No las generalizamos dado que puede crearse una nueva clase que no sea requerimiento que tenga estos atributos y estariamos obligando a que los tenga. Aunque en este caso, las 3 clases hijas posean estos atributos, las definimos particularmente en cada subclase

//    private String fechaEnvasado;
//    private String granjaOrigen;


    public Producto(String fecha_vencimiento, int nroLote) {
        this.fecha_vencimiento = fecha_vencimiento;
        this.nroLote = nroLote;
    }

    public String getEtiqueta() {
        return "Lote: " + nroLote + "\nFecha: " + fecha_vencimiento + "\n";
    }

    public String getFecha_vencimiento() {
        return fecha_vencimiento;
    }

    public int getNroLote() {
        return nroLote;
    }

}
