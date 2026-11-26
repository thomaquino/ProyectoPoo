/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app;
import conexion.ConexionBD;
import java.sql.Connection;

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
    }
    
}
