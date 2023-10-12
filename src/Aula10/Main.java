package Aula10;

import Aula10.Entity.Usuario;
import Aula10.dao.UsuarioDAO;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        Usuario usu =  new Usuario(1, "maria", "333");
        
        UsuarioDAO usuDAO = new UsuarioDAO();
        //usuDAO.inserir(usu);
        //usuDAO.editar(usu);
        //usuDAO.excluir(1);
        
        ArrayList<Usuario> lstUsuarios = usuDAO.getAllUsuarios();
        for (Usuario usuTMp : lstUsuarios) {
            JOptionPane.showMessageDialog(null, usuTMp.getUsuario());
        }
    }
}
