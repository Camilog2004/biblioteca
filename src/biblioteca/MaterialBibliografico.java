package biblioteca;

public class MaterialBibliografico {
    // Atributo
    private int numeroPaginas;

    // Constructor
    public MaterialBibliografico(int numeroPaginas) {
        if (numeroPaginas > 0) {
            this.numeroPaginas = numeroPaginas;
        } 
    }

    // Getter y Setter
    public int getNumeroPaginas() {
        return numeroPaginas;
    }

    public void setNumeroPaginas(int numeroPaginas) {
        if (numeroPaginas > 0) {
            this.numeroPaginas = numeroPaginas;
        } 
    }

    @Override
    public String toString() {
        return "Número de Páginas: " + numeroPaginas;
    }
}
