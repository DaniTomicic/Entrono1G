public class Libro {
    private String titulo;
    private String autor;
    private int numPaginas;
    private String ISBN;

    //constructor
    public Libro(String autor, String titulo, int numPaginas, String ISBN) {
        this.autor = autor;
        this.titulo = titulo;
        this.numPaginas = numPaginas;
        this.ISBN = ISBN;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        if (titulo.isEmpty()){
            System.out.println("No se puede estar vacio");
        }else {
            this.titulo = titulo;
        }
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        if (autor.isEmpty()) {
            System.out.println("No se puede estar vacio");
        } else {
            this.autor = autor;
        }
    }
    public int getNumPaginas() {
        return numPaginas;
    }

    public void setNumPaginas(int numPaginas) {
        if (numPaginas <= 0){
            System.out.println("No se puede ser tan poco");
        }else {
            this.numPaginas = numPaginas;
        }
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    @Override
    public String toString() {
        return "el libro con ISBN: " + ISBN +
                " creado por el autor " + autor +
                " tiene " +numPaginas + "paginas";
    }
}
