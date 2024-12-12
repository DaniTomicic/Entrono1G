import javax.swing.*;

public abstract class Cuenta {
    private Persona titular; //referencia a objeto Persona
    private int numeroCuenta;

    private double saldo;

    //Constuctor
    public Cuenta(double saldo) {
        this.titular = titular;
        this.numeroCuenta = numeroCuenta;

        if (saldo > 0){
            this.saldo = saldo;
        }else {
            throw new IllegalArgumentException("El saldo no puede ser negativo");
        }
    }
    //metodos
    public void ingresar(double ingreso){
        if (ingreso > 0){
            this.saldo += ingreso;
        }else {
            JOptionPane.showMessageDialog(null,"Saldo no valido para el ingreso");
        }
    }
    public void retirar(double ingreso){
        if (ingreso > 0 && ingreso < saldo){
            saldo -= ingreso;
            JOptionPane.showMessageDialog(null,"Se ha retirado " + ingreso +"€");
        }else if (ingreso > saldo){
            JOptionPane.showMessageDialog(null,"saldo insuficiente");
        }else      {
            JOptionPane.showMessageDialog(null,"No puede ser retirado ese importe");
        }
    }
    public void actualizarSaldo(){
        JOptionPane.showMessageDialog(null,"Actualizando...");
    }

    //getter + setter
    public Persona getTitular() {
        return titular;
    }
    public void setTitular(Persona titular) {
        this.titular = titular;
    }
    public int getNumeroCuenta() {
        return numeroCuenta;
    }
    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }
    public double getSaldo() {
        return saldo;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public abstract void actuaizarSaldo();
}
