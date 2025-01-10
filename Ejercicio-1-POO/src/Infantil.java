public class Infantil extends Cuenta{
    public String tutor;

    public Infantil(String tutor,String titular, double cantidad) {
        super(titular, cantidad);
        this.tutor = tutor;
    }
    public void regalo(){
        System.out.println("juguete");
    }

    public Infantil(String tutor,String titular) {
        super(titular);
        this.tutor = tutor;
    }

    public String getTutor() {
        return tutor;
    }

    public void setTutor(String tutor) {
        this.tutor = tutor;
    }

    @Override
    public String toString() {
        return "Infantil " +
                "tutor= " + tutor +
                super.toString();
    }
}
