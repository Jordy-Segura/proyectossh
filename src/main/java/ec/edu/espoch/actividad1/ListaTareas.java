package ec.edu.espoch.actividad1;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author jordy
 */
public class ListaTareas {
    private final List<Tarea> tareas;

    public ListaTareas() {
        tareas = new ArrayList<>();
    }

    public void agregarTarea(Tarea tarea) {
        tareas.add(tarea);
    }

    public void marcarTareaComoCompletada(int index) {
        if (index >= 0 && index < tareas.size()) {
            tareas.get(index).marcarComoCompletada();
        }
    }

    public void eliminarTarea(int index) {
        if (index >= 0 && index < tareas.size()) {
            Tarea tareaEliminada = tareas.get(index);
            System.out.println("\n Eliminando tarea: " + tareaEliminada);
            tareas.remove(index);
        }     
    }

    public void mostrarTareas() {
        for (int i = 0; i < tareas.size(); i++) {
            System.out.println((i+1) + ": " + tareas.get(i));
        }
    }
}