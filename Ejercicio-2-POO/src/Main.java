public class Main {
    public static void main(String[] args) {
        Libro mansionDax = new Libro("Mon","La mansion Dax",290,"2");
        Libro doraExploradora = new Libro("Mon","Soy Dora!",290,"15");
        mansionDax.setNumPaginas(900);
        doraExploradora.setAutor("Nemo");

        System.out.println(mansionDax + "\n"  +doraExploradora);

        if (doraExploradora.getNumPaginas() > mansionDax.getNumPaginas()){
            System.out.println(doraExploradora.getTitulo() + " tiene mas paginas");
        }else System.out.println(mansionDax.getTitulo() + " tiene mas paginas");


    }
}