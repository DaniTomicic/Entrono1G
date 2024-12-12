import javax.swing.*;

public class CuentaAhorro extends Cuenta {
    private double tasaInteres; // Porcentaje de interés anual

    public CuentaAhorro(double saldoInicial, double tasaInteres) {
        super(saldoInicial);
        if (tasaInteres > 0) {
            this.tasaInteres = tasaInteres;
        } else {
            throw new IllegalArgumentException("La tasa de interés debe ser positiva.");
        }
    }

    @Override
    public void actualizarSaldo() {
        double interes = getSaldo() * tasaInteres / 100;
        ingresar(interes); // Agrega el interés al saldo
        System.out.println("Se ha actualizado el saldo con un interés de " + tasaInteres + "%.");
    }

    @Override
    public void actuaizarSaldo() {

    }
}
