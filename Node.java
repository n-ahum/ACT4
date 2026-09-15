/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package act4;

/**
 *
 * @author nahum
 */
public class Node {
    Empleado emp;
    Node izquierdo, derecho, parent;

    public Node(Empleado emp) {
        this.emp = emp;
    }
}