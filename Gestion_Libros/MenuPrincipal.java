import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class MenuPrincipal {
    private static Biblioteca biblioteca = new Biblioteca();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean salir = false;

        // Agregamos algunos libros y usuarios por defecto
        biblioteca.agregarLibro(new Libro(1, "El Quijote", "Miguel de Cervantes"));
        biblioteca.agregarLibro(new Libro(2, "Cien Años de Soledad", "Gabriel García Márquez"));
        biblioteca.agregarUsuario(new Usuario(1, "Carlos Pérez"));
        biblioteca.agregarUsuario(new Usuario(2, "Ana Gómez"));

        while (!salir) {
            System.out.println("=== Sistema de Gestión de Biblioteca ===");
            System.out.println("1. Mostrar Libros");
            System.out.println("2. Mostrar Usuarios");
            System.out.println("3. Prestar Libro");
            System.out.println("4. Devolver Libro");
            System.out.println("5. Salir");
            System.out.print("Selecciona una opción: ");
            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    biblioteca.mostrarLibros();
                    break;
                case 2:
                    biblioteca.mostrarUsuarios();
                    break;
                case 3:
                    System.out.print("Ingresa el ID del libro: ");
                    int idLibro = scanner.nextInt();
                    System.out.print("Ingresa el ID del usuario: ");
                    int idUsuario = scanner.nextInt();
                    biblioteca.prestarLibro(idLibro, idUsuario);
                    break;
                case 4:
                    System.out.print("Ingresa el ID del libro: ");
                    int idLibroDevolucion = scanner.nextInt();
                    biblioteca.devolverLibro(idLibroDevolucion);
                    break;
                case 5:
                    salir = true;
                    break;
                default:
                    System.out.println("Opción inválida.");
            }
        }

        scanner.close();
    }
}