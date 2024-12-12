import javax.swing.*;

public class CuentaCorriente extends Cuenta{
    private final double limiteDescubierto;

    public CuentaCorriente(double saldo,double limiteDescubierto) {
        super(saldo);
        if (limiteDescubierto >= 0){
            this.limiteDescubierto = limiteDescubierto;
        }else {
            throw new IllegalArgumentException("El limite debe ser mayor que 0");
        }
    }

    @Override
    public void retirar(double ingreso) {
        if (ingreso > 0 && getSaldo() + limiteDescubierto >= ingreso){
            double saldoActualizado = getSaldo() - ingreso;
            super.ingresar(-ingreso); // para modificar el saldo
            JOptionPane.showMessageDialog(null,"Se ha retirado" + ingreso);
        } else if (ingreso > getSaldo() + limiteDescubierto) {
            JOptionPane.showMessageDialog(null,"No se puede retirar " + ingreso);
        }else {
            JOptionPane.showMessageDialog(null,"ingreso no valido");
        }
    }
    @Override
    public void actuaizarSaldo() {
        JOptionPane.showMessageDialog(null,"No se hacen actualizaciones");
    }
}
