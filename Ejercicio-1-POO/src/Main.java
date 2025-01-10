public class Main {
    public static void main(String[] args) {
        Cuenta adrian = new Cuenta("adrian",600);
        adrian.ingresar(100);
        adrian.retirar(90);

        System.out.println(adrian);

        Infantil cInfantil = new Infantil("papa","ana",50);

        cInfantil.ingresar(60);
        System.out.println(cInfantil);

        cInfantil.regalo();

        Vivienda cVivienda = new Vivienda("Tomo",160,1.6);
        cVivienda.setTasa(3);


        System.out.println(cVivienda);
    }
}