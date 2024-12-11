public class Biblioteca {

    private int idBiblioteca;
    private int diasPrestados;
    private String titulo;
    private String autor;

    public Biblioteca(int idBiblioteca, int diasPrestados, String titulo, String autor) {
        this.idBiblioteca = idBiblioteca;
        this.diasPrestados = diasPrestados;
        this.titulo = titulo;
        this.autor = autor;
    }

    // metodos
    public void prestar() {
        System.out.println("se ha prestado el libro");
    }
    public void devolver(){
        System.out.println("se ha devuelto el libro");
    }
    public void esperar(){
        System.out.println("esperando...");
    }

//getter
    public int getIdBiblioteca() {
        return idBiblioteca;
    }

//setter
    public void setIdBiblioteca(int idBiblioteca) {
        this.idBiblioteca = idBiblioteca;
    }
}
