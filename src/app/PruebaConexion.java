/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app;
import conexion.ConexionBD;
import java.sql.Connection;
import dao.EstudianteDAO;
import modelo.Estudiante;

/**
 *
 * @author jtcaq
 */
public class PruebaConexion {
    public static void main(String[] args){
        
        try {
            Connection conexion = ConexionBD.conectar();
            System.out.println("Conexion exitosa");
        } catch(Exception e){
            System.out.println("error: "+e.getMessage());
        }
    
    EstudianteDAO dao = new EstudianteDAO();
    
    Estudiante estudiante = new Estudiante (0, "Jack","jack@utp.edu.pe","ingenieria");
    
    boolean registrado = dao.registrarEstudiante(estudiante);
    
        System.out.println(registrado ? "Registro Exitoso": "Error al registrar");
    
    }
    
    
}
