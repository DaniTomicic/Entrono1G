public class Cuenta{

    String titular;
    double cantidad;

    //construcores
    //obligatorio
    public Cuenta(String titular, double cantidad) {
        this.titular = titular;
        this.cantidad = cantidad;
    }
    //opcional
    public Cuenta(String titular) {
        this.titular = titular;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    //metodos
    public void ingresar(double cantidad){
        if (cantidad < 0 ){
            System.out.println("No se puede ingresar la cantidad");
        }else {
            this.cantidad += cantidad;
        }
    }
    public void retirar(double cantidad){
        if (cantidad < 0 ){
            System.out.println("No se puede ingresar la cantidad");
        }else {
            this.cantidad += cantidad;
        }
    }


    //toSring
    @Override
    public String toString() {
        return "Cuenta{" +
                "titular='" + titular + '\'' +
                ", cantidad=" + cantidad +
                '}';
    }
}
