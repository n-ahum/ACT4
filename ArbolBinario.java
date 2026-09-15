/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package act4;

/**
 *
 * @author nahum
 */
public class ArbolBinario {
    private Node raiz;

    public void insertar(Empleado emp) {
        raiz = insertarRec(raiz, null, emp);
    }

    private Node insertarRec(Node actual, Node parent, Empleado emp) {
        if (actual == null) {
            Node nuevo = new Node(emp);
            nuevo.parent = parent;
            return nuevo;
        }
        if (emp.id < actual.emp.id) {
            actual.izquierdo = insertarRec(actual.izquierdo, actual, emp);
        } else if (emp.id > actual.emp.id) {
            actual.derecho = insertarRec(actual.derecho, actual, emp);
        }
        return actual;
    }

    public Node buscar(int id) {
        return buscarRec(raiz, id);
    }

    private Node buscarRec(Node actual, int id) {
        if (actual == null || actual.emp.id == id) return actual;
        return id < actual.emp.id ? buscarRec(actual.izquierdo, id) : buscarRec(actual.derecho, id);
    }

    public void eliminar(int id) {
        raiz = eliminarRec(raiz, id);
    }

    private Node eliminarRec(Node actual, int id) {
        if (actual == null) return null;

        if (id < actual.emp.id) {
            actual.izquierdo = eliminarRec(actual.izquierdo, id);
        } else if (id > actual.emp.id) {
            actual.derecho = eliminarRec(actual.derecho, id);
        } else {
            if (actual.izquierdo == null) return actualizarParent(actual.derecho, actual.parent);
            if (actual.derecho == null) return actualizarParent(actual.izquierdo, actual.parent);

            // Reemplazo directo del objeto completo Empleado
            Node sucesor = minNode(actual.derecho);
            actual.emp = sucesor.emp;
            actual.derecho = eliminarRec(actual.derecho, sucesor.emp.id);
        }
        return actual;
    }

    private Node actualizarParent(Node hijo, Node parent) {
        if (hijo != null) hijo.parent = parent;
        return hijo;
    }

    private Node minNode(Node actual) {
        while (actual.izquierdo != null) actual = actual.izquierdo;
        return actual;
    }

    public void inorden()   { recorrer(raiz, "IN"); System.out.println(); }
    public void preorden()  { recorrer(raiz, "PRE"); System.out.println(); }
    public void postorden() { recorrer(raiz, "POST"); System.out.println(); }

    private void recorrer(Node actual, String tipo) {
        if (actual == null) return;
        if (tipo.equals("PRE")) System.out.println("  " + actual.emp);
        recorrer(actual.izquierdo, tipo);
        if (tipo.equals("IN")) System.out.println("  " + actual.emp);
        recorrer(actual.derecho, tipo);
        if (tipo.equals("POST")) System.out.println("  " + actual.emp);
    }
}