package Aula9_Heranca.Exercicio1;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        String opt = "";
        ArrayList<Imovel> lstImovel = new ArrayList<>();
        Imovel imo = null;
        
        int codigo;
        String endereco;
        double valor;
        double valorDesconto;
        double valorAdicional;
        
        while(!opt.equals("3")) {
            opt = JOptionPane.showInputDialog("1- Cadastrar\n 2- Exibir\n 3- Sair");
            if (opt == null) {
                System.exit(0);
            }
        
            switch (opt) {
                case "1":
                    String tipoImovel = JOptionPane.showInputDialog("Imovel [N]ovo ou [V]elho?").toUpperCase();
                    codigo = Integer.parseInt(JOptionPane.showInputDialog("Codigo:"));
                    endereco = JOptionPane.showInputDialog("Endereco:");
                    valor = Double.parseDouble(JOptionPane.showInputDialog("Valor:"));
                    
                    if (tipoImovel.equals("N")) {
                        valorAdicional = Double.parseDouble(JOptionPane.showInputDialog("Valor Adicional:"));
                        
                        imo = new ImovelNovo(valorAdicional, codigo, endereco, valor);
                      }
                    else {
                        valorDesconto = Double.parseDouble(JOptionPane.showInputDialog("Valor do Desconto:"));
                        imo = new ImovelVelho(valorDesconto, codigo, endereco, valor);                    
                    }
                    
                    lstImovel.add(imo);
                    
                    break;
                case "2":
                    if (!lstImovel.isEmpty()) {
                        String str = "";
                        for (Imovel imoTmp : lstImovel) {
                            str += imoTmp.imprimir();
                        }
                        
                        JOptionPane.showMessageDialog(null, str);
                        
                    } else {
                        JOptionPane.showMessageDialog(null, 
                                                "Voce precisa cadastrar um imovel.", 
                                                "Cuidado...", 
                                                JOptionPane.ERROR_MESSAGE);
                    }
                    break;
                case "3":
                    
                    break;
                default:
                    JOptionPane.showMessageDialog(null, 
                                                "Opcao Invalida", 
                                                "Ops...deu errado!",
                                                JOptionPane.ERROR_MESSAGE);
                    break;
            }
        }
    }
}
