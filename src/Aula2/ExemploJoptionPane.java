package Aula2;

import javax.swing.JOptionPane;

public class ExemploJoptionPane {
    public static void main(String[] args) {
        //String nome = JOptionPane.showInputDialog("Escreva um nome");
        //System.out.println("Nome:"+nome);
        
        /*Object[] itens = { "MA�A", "PERA", "BANANA" };
        
        Object selectedValue = JOptionPane.showInputDialog(null,"Esscolha um item",
            "Op�ao",
            JOptionPane.QUESTION_MESSAGE, 
            null, itens, itens[0]);
            
        System.out.println(selectedValue);*/
        
        JOptionPane.showMessageDialog(null, 
                "O que eu quero mostrar",
                "Aqui vai o titulo",
                JOptionPane.WARNING_MESSAGE);
        
        

    }
}
