/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import conexion.ConexionBD;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import modelo.Usuario;

/**
 *
 * @author jtcaq
 */
public class UsuarioDAO {
    
    public boolean registrarUsuario(Usuario usuario){
        //inserta usuario nuevo
        String sql = "INSET INTO usuario(nombre, correo) "+"VALUES (?, ?)";
        
        try ( Connection con = ConexionBD.conectar();
                PreparedStatement ps = con.prepareStatement(sql)){
            ps.setString(1, usuario.getNombre());
            ps.setString(2, usuario.getCorreo());
            int filas = ps.executeUpdate();
            return filas>0;
            
        }catch (SQLException e){
            System.out.println("Error al registrar usuario: " +e.getMessage());
            return false;
        }
    }
    
    public List<String> listarUsuarios(){
        List<String> usuarios = new ArrayList<>();
        
        String sql = "SELECT * FROM usuario";
    }
    
}
