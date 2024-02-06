package Aula7.Heranca;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        Professor prof = new Professor("Fabio", "23423", "222", 'N', 125000);
        
        Aluno alu = new Aluno("Joao", "12312", "1111");
        alu.setNota1(6);
        alu.setNota2(7);
        
        ArrayList<Pessoa> lstPessoas = new ArrayList<>();
        lstPessoas.add(alu);
        lstPessoas.add(prof);
        
        for (Pessoa p : lstPessoas) {
            System.out.println(p.imprimir());
        }
        
        //JOptionPane.showMessageDialog(null, alu.imprimir()+prof.imprimir());
    
    }
}
