import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Libro liburu = new Libro("JAVA","autor",1);

        Libro liburu2 = new Libro();
        liburu2.setAutor("pedro");
        liburu2.setTitulo("HTML");
        liburu2.setISBN(2);


        System.out.println(liburu + "\n" + liburu2);
        System.out.println(liburu.getAutor());

        Socio sucio = new Socio("Dani","Tomicic",30);
        Socio sucio2 = new Socio("Ibai","Mendoza",69);

        sucio2.setCodigoSocio(11);

        System.out.println(sucio2.getCodigoSocio());


        Prestamo prestamo1 = new Prestamo(liburu2,5,sucio2, LocalDate.now());

        System.out.println(prestamo1);
    }
}