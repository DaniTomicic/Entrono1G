public class Vivienda extends Cuenta{
    public double tasa;

    public Vivienda(String titular, double cantidad, double tasa) {
        super(titular, cantidad);
        this.tasa = tasa;
    }

    public double getTasa() {
        return tasa;
    }

    public void setTasa(double tasa) {
        this.tasa = tasa;
    }

    @Override
    public String toString() {
        return "Vivienda{" + super.toString() +
                ", tasa=" + tasa +
                '}';
    }
}
