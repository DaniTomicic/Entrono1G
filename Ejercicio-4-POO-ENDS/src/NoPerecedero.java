public class NoPerecedero extends Producto implements Tienda{
    private String tipo;

    public NoPerecedero(String nombre,double precio,String tipo) {
        super(nombre,precio);
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public double calcular() {
        return super.getPrecio();
    }

    @Override
    public String toString(){
        return super.toString()+" Tipo: " +tipo;
    }
}
