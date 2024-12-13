import java.time.LocalDate;

public class Prestamo {
    public int codPrestamo;

    public Libro libro;
    public Socio socio;

    public LocalDate fechaDevolucion;

    public Prestamo(Libro libro, int codPrestamo, Socio socio, LocalDate fechaDevolucion) {
        this.libro = libro;
        this.codPrestamo = codPrestamo;
        this.socio = socio;
        this.fechaDevolucion = fechaDevolucion;
    }

    public int getCodPrestamo() {
        return codPrestamo;
    }

    public void setCodPrestamo(int codPrestamo) {
        this.codPrestamo = codPrestamo;
    }

    public Socio getSocio() {
        return socio;
    }

    public void setSocio(Socio socio) {
        this.socio = socio;
    }

    public LocalDate getFechaDevolucion() {
        return fechaDevolucion;
    }

    public void setFechaDevolucion(LocalDate fechaDevolucion) {
        this.fechaDevolucion = fechaDevolucion;
    }

    public Libro getLibro() {
        return libro;
    }

    public void setLibro(Libro libro) {
        this.libro = libro;
    }

    @Override
    public String toString() {
        return "Prestamo{" +
                "codPrestamo=" + codPrestamo +
                ", libro=" + libro +
                ", socio=" + socio +
                ", fechaDevolucion=" + fechaDevolucion +
                '}';
    }
}
