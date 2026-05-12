package TrabajoPractico2;

public class ProductoCongelado extends Producto {
    private String fechaEnvasado;
    private String granjaOrigen;
    private int codigoSupervision;
    private double temperaturaMantenimiento;

    public ProductoCongelado(String fecha_vencimiento, int nroLote,String fechaEnvasado, int codigoSupervision, String granjaOrigen, double temperaturaMantenimiento) {
        super(fecha_vencimiento, nroLote);
        this.fechaEnvasado = fechaEnvasado;
        this.codigoSupervision = codigoSupervision;
        this.granjaOrigen = granjaOrigen;
        this.temperaturaMantenimiento = temperaturaMantenimiento;
    }



    public String getEtiqueta() {
        return super.getEtiqueta() + " | Temp. Recomendada: " + temperaturaMantenimiento + "°C";
    }

    public String getFechaEnvasado() {
        return fechaEnvasado;
    }

    public int getCodigoSupervision() {
        return codigoSupervision;
    }

    public String getGranjaOrigen() {
        return granjaOrigen;
    }

    public double getTemperaturaMantenimiento() {
        return temperaturaMantenimiento;
    }


}
