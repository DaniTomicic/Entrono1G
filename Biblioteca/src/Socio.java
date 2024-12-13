import java.time.LocalDate;

public class Socio {
    private String nombre;
    private String apellido;
    private int codigoSocio;

    //constructor
    Socio(String nombre, String apellido, int codigoSocio) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.codigoSocio = codigoSocio;
    }

    //metodos getter + setter

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getCodigoSocio() {
        return codigoSocio;
    }

    public void setCodigoSocio(int codigoSocio) {
        if (codigoSocio < 0 || codigoSocio > 1500) {
            System.out.println("Codigo erroneo");
        }else {
            this.codigoSocio = codigoSocio;
        }
    }

    //toString

    @Override
    public String toString() {
        return "Socio{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                '}';
    }
}
