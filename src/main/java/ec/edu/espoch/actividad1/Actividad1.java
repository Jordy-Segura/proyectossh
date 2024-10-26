/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package ec.edu.espoch.actividad1;

/**
 *
 * @author jordy
 */
public class Actividad1 {

    public static void main(String[] args) {
        ListaTareas lista = new ListaTareas();

        // Agregar tareas
        lista.agregarTarea(new Tarea("Estudiar Java"));
        lista.agregarTarea(new Tarea("Hacer ejercicio"));
        lista.agregarTarea(new Tarea("Hacer la compra"));
        lista.agregarTarea(new Tarea("Llamar a Carlos Mancero"));
        lista.agregarTarea(new Tarea("Leer un libro"));

        // Mostrar tareas
        System.out.println("Lista de Tareas:");
        lista.mostrarTareas();

        // Marcar la primera tarea como completada
        lista.marcarTareaComoCompletada(0);
        lista.marcarTareaComoCompletada(2);
        lista.marcarTareaComoCompletada(3);
        lista.marcarTareaComoCompletada(4);
        lista.marcarTareaComoCompletada(5);
        System.out.println("\n Tareas completadas:");
        lista.mostrarTareas();

        // Eliminar la segunda tarea
        lista.eliminarTarea(1);
        System.out.println("\n Tareas eliminadas:");
        lista.mostrarTareas();
    }
}
