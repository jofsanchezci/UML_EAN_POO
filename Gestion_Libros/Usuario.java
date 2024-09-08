import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;
class Usuario {
    private int id;
    private String nombre;

    public Usuario(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public String toString() {
        return "Usuario [ID: " + id + ", Nombre: " + nombre + "]";
    }
}