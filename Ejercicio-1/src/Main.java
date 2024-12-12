//todo guardar datos de cuenta bancaria
//todo Solo un numero de cuenta x persona
/* todo clase cuenta
    //Titular -> clase persona
    //numero cuenta -> int largo
    //saldo -> double
/* todo metodos cuenta
    //ingresar -> double
        //mete dinero en la cuenta (solo numero valido)
    //retirar -> double
        //saca dinero en la cuenta (si hay suficiente)
    //actualizarSaldo
        //depende de cada tipo de cuenta es distinto
/* todo tipos de cuenta
    //cuentaCorriente
        //interés fijo del 1.5%
    //cuentaAhorro
        //almacena atributo interes variabe + saldo
        //al retirar tener en cuenta saldo
        //constructores y toString()
        // metodo para otro interes
/ todo cuentaJoven -> cuentaCorriente + 30€
*/

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        //crear cuebtas de ahorro
        CuentaAhorro cuenta1  = new CuentaAhorro(1500,5);
        cuenta1.ingresar(500);
        cuenta1.retirar(1000);
        cuenta1.actuaizarSaldo();
        JOptionPane.showMessageDialog(null, "Saldo actual: " + cuenta1.getSaldo());

        //segunda cuenta
        CuentaAhorro cuenta2  = new CuentaAhorro(3000,5);
        cuenta2.ingresar(500);
        cuenta2.retirar(1500);
        cuenta2.actuaizarSaldo();
        JOptionPane.showMessageDialog(null, "Saldo actual: " + cuenta2.getSaldo());

        CuentaJoven cuenta3  = new CuentaJoven(2000);
        cuenta3.ingresar(500);
        cuenta3.retirar(1000);
        cuenta3.actuaizarSaldo();
        JOptionPane.showMessageDialog(null, "Saldo actual: " + cuenta3.getSaldo());

    }
}