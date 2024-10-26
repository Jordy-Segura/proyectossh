package ec.edu.espoch.actividad1;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author jordy
 */
public class Tarea {
    private String nombre;
    private boolean completada;

    public Tarea(String nombre) {
        this.nombre = nombre;
        this.completada = false; // Por defecto, la tarea está pendiente
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isCompletada() {
        return completada;
    }

    public void marcarComoCompletada() {
        this.completada = true;
    }

    @Override
    public String toString() {
        return nombre + " - " + (completada ? "Completada" : "Pendiente");
    }
}