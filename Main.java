/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package act4;

/**
 *
 * @author nahum
 */
public class Main {
    public static void main(String[] args) {
        ArbolBinario arbol = new ArbolBinario();

        // 1. Insertar
        arbol.insertar(new Empleado(105, "Jorge Ringa", "Director"));
        arbol.insertar(new Empleado(102, "Tomas Cado", "Tecnologias De Informacion"));
        arbol.insertar(new Empleado(101, "Roberta...", "Manager de Redes Sociales"));
        arbol.insertar(new Empleado(108, "Nahum Osvaldo", "Conserje"));
        
        System.out.println("empleados: ");
        arbol.inorden();
        
        // 3. Buscar
        Node n = arbol.buscar(102);
        System.out.println("/// BUSQUEDA ///\nBusca empleado 102: " + (n != null ? n.emp : "No existe"));

        // 4. Eliminar
        arbol.eliminar(102);
        System.out.println("\n\n/// ELIMINAR/// \n--- Tras eliminar ID 102 ---");
        arbol.inorden();

               // 2. Recorridos
        System.out.println("inorden: ");
        arbol.inorden();
        System.out.println("preorden: ");
        arbol.preorden();
        System.out.println("postorden: ");
        arbol.postorden();
    }
}