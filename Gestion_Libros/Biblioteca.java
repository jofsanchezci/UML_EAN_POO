import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

class Biblioteca {
    private List<Libro> listaLibros;
    private List<Usuario> listaUsuarios;
    private List<Prestamo> listaPrestamos;
    private int contadorPrestamos;

    public Biblioteca() {
        this.listaLibros = new ArrayList<>();
        this.listaUsuarios = new ArrayList<>();
        this.listaPrestamos = new ArrayList<>();
        this.contadorPrestamos = 1;
    }

    public void agregarLibro(Libro libro) {
        listaLibros.add(libro);
    }

    public void agregarUsuario(Usuario usuario) {
        listaUsuarios.add(usuario);
    }

    public void prestarLibro(int idLibro, int idUsuario) {
        Libro libro = buscarLibroPorId(idLibro);
        Usuario usuario = buscarUsuarioPorId(idUsuario);

        if (libro != null && usuario != null && libro.isDisponible()) {
            libro.setDisponible(false);
            Prestamo prestamo = new Prestamo(contadorPrestamos++, libro, usuario);
            listaPrestamos.add(prestamo);
            System.out.println("Préstamo realizado con éxito: " + prestamo);
        } else {
            System.out.println("Error al realizar el préstamo. El libro puede no estar disponible.");
        }
    }

    public void devolverLibro(int idLibro) {
        Libro libro = buscarLibroPorId(idLibro);
        if (libro != null && !libro.isDisponible()) {
            libro.setDisponible(true);
            System.out.println("El libro ha sido devuelto con éxito.");
        } else {
            System.out.println("Error al devolver el libro. El libro puede no estar prestado.");
        }
    }

    public void mostrarLibros() {
        for (Libro libro : listaLibros) {
            System.out.println(libro);
        }
    }

    public void mostrarUsuarios() {
        for (Usuario usuario : listaUsuarios) {
            System.out.println(usuario);
        }
    }

    private Libro buscarLibroPorId(int id) {
        for (Libro libro : listaLibros) {
            if (libro.getId() == id) {
                return libro;
            }
        }
        return null;
    }

    private Usuario buscarUsuarioPorId(int id) {
        for (Usuario usuario : listaUsuarios) {
            if (usuario.getId() == id) {
                return usuario;
            }
        }
        return null;
    }
}