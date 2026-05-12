package Unidad1;

public class Serie {
    private String titulo;
    private String descripcion;
    private String autor;
    private String genero;
    private Temporada temporadas;

    private int cantTemporadasCargadas = 0;


    public Serie(String titulo) {
        this.titulo = titulo;
    }
}
