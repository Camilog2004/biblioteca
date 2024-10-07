package biblioteca;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {

    // Atributo para almacenar los libros
    private List<Libro> libros;

    // Constructor
    public Biblioteca() {
        this.libros = new ArrayList<>();
    }

    // Método para agregar un libro a la biblioteca
    public void agregarLibro(Libro libro) {
        libros.add(libro);
    }

    // Método para prestar un libro
    public boolean prestarLibro(String isbn) {
        for (Libro libro : libros) {
            if (libro.getIsbn().equals(isbn)) {
                if (!libro.isPrestado()) {
                    libro.setisPrestado(true);
                    return true; // El libro fue prestado con éxito
                } else {
                    return false; // El libro ya está prestado
                }
            }
        }
        return false; // El libro no se encontró
    }

    // Método para devolver un libro
    public boolean devolverLibro(String isbn) {
        for (Libro libro : libros) {
            if (libro.getIsbn().equals(isbn)) {
                if (libro.isPrestado()) {
                    libro.setisPrestado(false);
                    return true; // El libro fue devuelto con éxito
                } else {
                    return false; // El libro no estaba prestado
                }
            }
        }
        return false; // El libro no se encontró
    }

    // Método para obtener la lista de libros
    public List<Libro> getLibros() {
        return libros;
    }
}
