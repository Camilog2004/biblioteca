package biblioteca;

public class Libro extends MaterialBibliografico {

    // Atributos
    private String titulo;
    private String autor;
    private int anoPublicacion;
    private String isbn;
    private boolean isPrestado;

    // Constructor
    public Libro(String titulo, String autor, int anoPublicacion, String isbn, int numeroPaginas) {
        super(numeroPaginas);
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacion = anoPublicacion;
        this.isbn = isbn;
        this.isPrestado=false;
    }

    // Getters y Setters
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAnoPublicacion() {
        return anoPublicacion;
    }

    public void setAnoPublicacion(int anoPublicacion) {
        if (anoPublicacion > 0) {
            this.anoPublicacion = anoPublicacion;
        } 
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }


    public boolean isPrestado() {
        return isPrestado;
    }

    public void setisPrestado(boolean isPrestado){
        this.isPrestado=isPrestado;
    }
}
