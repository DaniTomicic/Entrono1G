public class Main {
    public static void main(String[] args) {
        Perecedero[] perecederos = new Perecedero[2];

        perecederos[0] = new Perecedero(10,"Chocolate",5);

        perecederos[1] = new Perecedero(6,"Yogures",3);

        double total1 = perecederos[0].calcular();
        double total2 = perecederos[1].calcular();

        System.out.println(total1 + "\n"+ total2);

    }
}