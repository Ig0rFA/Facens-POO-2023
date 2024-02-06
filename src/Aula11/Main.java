package Aula11;

import Aula11.dao.UsuarioDAO;
import Aula11.entity.Usuario;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Usuario usu = new Usuario(0, "testhoje", "123");
        
        UsuarioDAO usuDAO = new UsuarioDAO();
        ArrayList<Usuario> lstUsuarios = usuDAO.getAll(Usuario.class);
        for (Usuario usuTemp : lstUsuarios) {
            System.out.println(usuTemp.getUsuario());
        }
    }
}
