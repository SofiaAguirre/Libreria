package main.java.tp5;

public abstract class Publicacion {
    private String codigo;
    private int anioPublicacion;
    private String titulo;


    public Publicacion(String codigo, int anioPublicacion, String titulo){
         this.codigo = codigo;
         this.anioPublicacion = anioPublicacion;
         this.titulo = titulo;
    }

    public String getCodigo() {
        return codigo;
    }

    public int getAnioPublicacion() {
        return anioPublicacion;
    }

    public String getTitulo() {
        return titulo;
    }
    @Override
    public String toString(){
        return getCodigo() + " , " + getAnioPublicacion() + " , " + getTitulo();
    }

}
