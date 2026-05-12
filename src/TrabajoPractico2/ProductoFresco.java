package TrabajoPractico2;

public class ProductoFresco extends Producto {
    private String fechaEnvasado;
    private String granjaOrigen;

    public ProductoFresco(String fecha_Vencimiento, int nroLote, String fechaEnvasado, String granjaOrigen) {
        super(fecha_Vencimiento, nroLote);
        this.fechaEnvasado = fechaEnvasado;
        this.granjaOrigen = granjaOrigen;
    }




    public String getFechaEnvasado() {
        return fechaEnvasado;
    }

    public String getGranjaOrigen() {
        return granjaOrigen;
    }
}
