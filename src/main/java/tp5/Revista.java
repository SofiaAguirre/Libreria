package main.java.tp5;

public class Revista extends Publicacion{
    public Revista(String codigo, int anioPublicacion, String titulo) {
        super(codigo, anioPublicacion, titulo);
    }

    @Override
    public String toString() {
        return "//Librería Terry y Pampa//" + "Revista: " + super.toString();
    }
}
