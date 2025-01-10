public abstract class Producto{
    private String nombre;
    private double precio;

    public Producto(String nombre, double precio) {
        this.precio = precio;
        this.nombre = nombre;
    }
    public Producto() {}

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double calcular() {
        return precio;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Producto{" + "nombre=" + nombre + ", precio=" + precio + '}';
    }
}
