
package dao;

import java.sql.Connection;
import conexion.ConexionBD;
import modelo.Estudiante;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author jtcaq
 */
public class EstudianteDAO {
    
    public boolean registrarEstudiante(Estudiante estudiante){
        
        String sqlUsuario = "INSERT INTO usuario" + "(nombre, correo) " 
                + "VALUES (?, ?)";
        
        String sqlEstudiante = "INSERT INTO estudiante " 
                + "(usuario_id_usuario,carrera)" + "VALUES (?, ?)";
        
        try(Connection con = ConexionBD.conectar()) {
            con.setAutoCommit(false);
            int idUsuario;
            
            try(PreparedStatement psUsuario = con.prepareStatement(sqlUsuario,
            Statement.RETURN_GENERATED_KEYS)){
                psUsuario.setString(1, estudiante.getNombre());
                psUsuario.setString(2, estudiante.getCorreo());
                psUsuario.executeUpdate();
                ResultSet rs = psUsuario.getGeneratedKeys();
                
                if (rs.next()){
                    idUsuario = rs.getInt(1);
                }else{
                    throw new SQLException("No se pudo obtener el ID generado.");
                }
            }try(PreparedStatement psEstudiante = con.prepareStatement(sqlEstudiante)){
                psEstudiante.setInt(1, idUsuario);
                psEstudiante.setString(2, estudiante.getCarrera());
                psEstudiante.executeUpdate();
            }
            con.commit();
            return true;
            
        }catch (SQLException e){
            System.out.println("Error al registrar estudiante: "+e.getMessage());
            return false;
        }
    }
    
}
