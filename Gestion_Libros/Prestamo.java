import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;
class Prestamo {
    private int idPrestamo;
    private Libro libro;
    private Usuario usuario;
    private Date fechaPrestamo;
    private Date fechaDevolucion;

    public Prestamo(int idPrestamo, Libro libro, Usuario usuario) {
        this.idPrestamo = idPrestamo;
        this.libro = libro;
        this.usuario = usuario;
        this.fechaPrestamo = new Date();
    }

    public int getIdPrestamo() {
        return idPrestamo;
    }

    @Override
    public String toString() {
        return "Prestamo [ID Prestamo: " + idPrestamo + ", Libro: " + libro.getTitulo() + ", Usuario: " + usuario.getNombre() +
               ", Fecha Prestamo: " + fechaPrestamo + "]";
    }
}