package main.java.tp5;

public class Libro extends Publicacion implements Prestable{
    private boolean isPrestado = false;

    public Libro(String codigo, int anioPublicacion, String titulo) {
        super(codigo, anioPublicacion, titulo);
    }

    @Override
    public String toString() {
        return "//Librería Terry y Chatran//" +  "Libro: " + super.toString() + prestado();
    }

    @Override
    public void prestar() {
       isPrestado = true;
    }

    @Override
    public void devolver() {
       isPrestado = false;
    }

    @Override
    public String prestado() {
        if (isPrestado == true){
            return ", No Disponible(Prestado)";
        } else {
            return ", Disponible";
        }

    }
}
