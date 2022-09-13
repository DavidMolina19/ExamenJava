package clases;

public class Libro {
    private String nombre;
    private String codigo;
    private int numeroPaginas;
    private int numeroEjemplares;
    private String autor;


    public Libro() {
    }

    public Libro(String nombre, String codigo, int numeroPaginas, int numeroEjemplares, String autor) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.numeroPaginas = numeroPaginas;
        this.numeroEjemplares = numeroEjemplares;
        this.autor = autor;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public int getNumeroPaginas() {
        return numeroPaginas;
    }

    public void setNumeroPaginas(int numeroPaginas) {
        this.numeroPaginas = numeroPaginas;
    }

    public int getNumeroEjemplares() {
        return numeroEjemplares;
    }

    public void setNumeroEjemplares(int numeroEjemplares) {
        this.numeroEjemplares = numeroEjemplares;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }
}
