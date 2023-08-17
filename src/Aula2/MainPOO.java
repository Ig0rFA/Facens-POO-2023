package Aula2;

import javax.swing.JOptionPane;

public class MainPOO {
    public static void main(String[] args) {
        String nome, ra, curso, opt;
        Aluno alu = null;
        
        int x = Integer.parseInt("1");
        boolean myBool = Boolean.parseBoolean("true");
        double d = Double.parseDouble("1.5");
        
        System.out.println(myBool);
        do {
            opt = JOptionPane.showInputDialog("1- Cadastrar\n2- Consultar\n3- Sair");
            if (opt == null) {
                System.exit(0);
            }
            
            switch (opt) {
                case "1":
                    // cadastrar
                    nome = JOptionPane.showInputDialog("Nome:");
                    ra = JOptionPane.showInputDialog("RA:");
                    curso = JOptionPane.showInputDialog("Curso:");
                    
                    alu = new Aluno();
                    alu.setNome(nome);
                    alu.setCurso(curso);
                    alu.setRa(ra);
                    
                    break;
                case "2":
                    // consultar
                    if (alu == null) {
                        JOptionPane.showMessageDialog(null, 
                                "Precisa cadastrar um aluno",
                                "Alerta",
                                JOptionPane.ERROR_MESSAGE);
                        break;
                    }
                    
                    JOptionPane.showMessageDialog(null, alu.imprimir());

                    break;
                case "3":
                    // Sair
                    break;
                default:
                    // opcao invalida
            }
        } while(!opt.equals("3"));
    }
}
