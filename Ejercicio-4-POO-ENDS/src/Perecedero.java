public class Perecedero extends Producto implements Tienda{
    private int diasCaducar;

    public Perecedero(double precio, String nombre) {
        super(nombre, precio);
    }

    public Perecedero(double precio, String nombre, int diasCaducar) {
        super(nombre, precio);
        this.diasCaducar = diasCaducar;
    }

    public int getDiasCaducar() {
        return diasCaducar;
    }

    public void setDiasCaducar(int diasCaducar) {
        this.diasCaducar = diasCaducar;
    }

    @Override
    public double calcular() {
        double precioFinal;

        switch (getDiasCaducar()){
            case 1:{
                precioFinal = getPrecio()/4;
                break;
            }
            case 2:{
                precioFinal = getPrecio()/3;
                break;
            }
            case 3:{
                precioFinal = getPrecio()/2;
                break;
            }
            default:{
                precioFinal = getPrecio();
            }
        }
        return precioFinal;
    }

    @Override
    public String toString(){
        return super.toString() + "\nDias Caducar: " + diasCaducar;
    }

}
