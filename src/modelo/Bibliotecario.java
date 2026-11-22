/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Maricielo Isabel Diaz Morales
 */
public class Bibliotecario extends Usuario {
    
    private String area;

    public Bibliotecario() {
    }

    public Bibliotecario(int id, String nombre, String correo, String area) {
        super(id, nombre, correo);
        this.area = area;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    @Override
    public String getTipoUsuario() {
        return "Bibliotecario";
    }
    
    
}
