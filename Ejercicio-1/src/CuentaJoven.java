public class CuentaJoven extends Cuenta {
    private double tasaInteres = 30; // Valor por defecto

    public CuentaJoven(double saldoInicial) {
        super(saldoInicial);
    }

    @Override
    public void actuaizarSaldo() {
        double interes = getSaldo() - tasaInteres ;
        ingresar(interes);
        System.out.println("Se ha actualizado el saldo con un interés de " + tasaInteres + "%.");
    }
}
