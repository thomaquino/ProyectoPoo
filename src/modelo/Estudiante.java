/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Maricielo Isabel Diaz Morales
 */
public class Estudiante extends Usuario {
    
    private String carrera;

    public Estudiante() {
    }

    public Estudiante(String carrera) {
        this.carrera = carrera;
    }

    public Estudiante(int id, String nombre, String correo, String carrera) {
        super(id, nombre, correo);
        this.carrera = carrera;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }
        

    @Override
    public String getTipoUsuario() {
        return "Estudiante";
    }
    
    
    
}
