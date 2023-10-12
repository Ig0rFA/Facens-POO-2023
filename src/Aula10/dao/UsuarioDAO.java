package Aula10.dao;

import Aula10.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import Aula10.Entity.Usuario;
import java.sql.ResultSet;
import java.util.ArrayList;

public class UsuarioDAO {
    public void inserir(Usuario usuario) {
        String sql = "insert into usuario(usuario,senha) values (?,?)";

        try (Connection conn = ConnectionFactory.getConnection(); 
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, usuario.getUsuario());
            stmt.setString(2, usuario.getSenha());
            
            stmt.executeUpdate();

        } catch (SQLException ex) {
            System.out.println("Erro ao inserir usuário: " + ex.getMessage());
        }
    }
    
    public void editar(Usuario usuario) {
        String sql = "update usuario set usuario = ?, senha = ? where id = ?";

        try (Connection conn = ConnectionFactory.getConnection(); 
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, usuario.getUsuario());
            stmt.setString(2, usuario.getSenha());
            stmt.setInt(3, usuario.getId());
            stmt.execute();
  
        } catch (SQLException ex) {
            System.out.println("Erro ao editar usuário: " + ex.getMessage());
        }
    }
    
    public void excluir(int codigo) {
        String sql = "delete from usuario where id = ?";

        try (Connection conn = ConnectionFactory.getConnection(); 
                PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setInt(1, codigo);
            stmt.execute();
        } catch (SQLException ex) {
            System.out.println("Erro ao excluir usuário: " + ex.getMessage());
        }
    }
    
    public ArrayList<Usuario> getAllUsuarios() {
        String sql = "SELECT * FROM usuario";
        ArrayList<Usuario> usuarios = new ArrayList<>();

        try (Connection conn = ConnectionFactory.getConnection(); 
                PreparedStatement stmt = conn.prepareStatement(sql); 
                ResultSet rs = stmt.executeQuery()) {

            while (rs.next()) {
                String usuario = rs.getString("usuario");
                String senha = rs.getString("senha");
                int id = rs.getInt("id");

                Usuario usu = new Usuario(id, usuario, senha);
                usuarios.add(usu);
            }

        } catch (SQLException ex) {
            System.out.println("Erro ao buscar Todos usuário: " + ex.getMessage());
        }

        return usuarios;
    }
}
