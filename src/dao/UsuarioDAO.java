
package dao;

import conexion.ConexionBD;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author jtcaq
 */
public class UsuarioDAO {
    
    public List<String> listarUsuarios(){
        List<String> usuarios = new ArrayList<>();
        
        String sql = "SELECT * FROM usuario";
        
        try (
                Connection con = ConexionBD.conectar();
                PreparedStatement ps = con.prepareStatement(sql);
                ResultSet rs = ps.executeQuery()){
            while (rs.next()){
                usuarios.add(rs.getInt("id_usuario")+" - "+rs.getString("nombre")
                +" - "+rs.getString("correo")
                );
            }
        }catch (SQLException e){
            System.out.println("Error al listar usuarios: "+ e.getMessage()) ;
        }
        
        return usuarios;
    };
    
    public String buscarUsuario (int id){
        
        String sql = "SELECT * FROM usuario "+"WHERE id_usuario = ?";
        
        try (
                Connection con = ConexionBD.conectar();
                PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setInt(1, id);
            
            ResultSet rs = ps.executeQuery();
            
            if(rs.next()){
                
                return rs.getString("nombre")+" - "+rs.getString("correo");
                
            }
        }catch (SQLException e){
            System.out.println(e.getMessage());
        }
        
        return null;
                
    }
    
    public boolean actualizarUsuario( int id, String nombre, String correo){
        
        String sql = "UPDATE usuario "+"SET nombre = ?, "+"correo = ? "+"WHERE id_usuario = ?";
        
        try (
                Connection con = ConexionBD.conectar();
                PreparedStatement ps=con.prepareStatement(sql)){
                ps.setString(1, nombre);
                ps.setString(2, correo);
                ps.setInt(3, id);
            
                return ps.executeUpdate()>0;
            
        }catch (SQLException e){
            
            System.out.println(e.getMessage());
            
            return false;
        }
                
    }
    
    public boolean eliminarUsuario(int id){
        
        String sql = "DELETE FROM usuario "+"WHERE id_usuario = ?";
        
        try(
                Connection con = ConexionBD.conectar();
                PreparedStatement ps = con.prepareStatement(sql)){
                ps.setInt(1, id);
                return ps.executeUpdate() > 0;
            
        }catch (SQLException e) {
            System.out.println(e.getMessage());
            
            return false;
        }
    }
    
}
