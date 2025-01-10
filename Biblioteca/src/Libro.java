public class Libro {

    //atributos
    private String titulo;
    private String autor;
    private int ISBN;

    //constructor
    public Libro(String titulo, String autor, int ISBN) {
        this.titulo = titulo;
        this.autor = autor;
        this.ISBN = ISBN;
    }

    //vacio
    public Libro(){

    }

    //metodos getter + setter
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        if (!titulo.trim().isEmpty()){
            this.titulo = titulo;
        }else {
            System.out.println("No se puede ingresar el titulo");
        }
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        if (!autor.trim().isEmpty()){
            this.autor = autor;
        }else {
            System.out.println("No se puede ingresar el autor");
        }
    }

    public int getISBN() {
        return ISBN;
    }

    public void setISBN(int ISBN) {
        if (ISBN <= 0){
            System.out.println("No se puede ingresar el ISBN");
        }else {
            this.ISBN = ISBN;
        }
    }

    @Override
    public String toString() {
        return "Libro{" +
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                '}';
    }
}
