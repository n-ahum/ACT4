/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package act4;

/**
 *
 * @author nahum
 */
public class Empleado {
    int id;
    String nombre;
    String puesto;

    public Empleado(int id, String nombre, String puesto) {
        this.id = id;
        this.nombre = nombre;
        this.puesto = puesto;
    }

    @Override
    public String toString() {
        return "[ID: " + id + " | " + nombre + " - " + puesto + "]";
    }
}
