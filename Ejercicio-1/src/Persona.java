public class Persona {
    private String titular;
    private long numeroCuenta;
    private double saldo;

    //Constructor con todos los parametros
    public Persona(String titular, long numeroCuenta, double saldo) {
        this.titular = titular;
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
    }
    //Constructor SIN saldo
    public Persona(String titular,long numeroCuenta) {
        this.titular = titular;
        this.numeroCuenta = numeroCuenta;
        this.saldo = 0.0;
    }

    //getter + setter


    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }
    public long getNumeroCuenta() {
        return numeroCuenta;
    }
    public void setNumeroCuenta(long numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }
    public double getSaldo() {
        return saldo;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    //mostrar info:
    @Override
    public String toString() {
        return "Persona : " + titular
                + "IBAN : " + numeroCuenta
                + "Saldo : " + saldo;
    }
}
