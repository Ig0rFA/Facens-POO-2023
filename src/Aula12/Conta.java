
package Aula12;


public class Conta {
    private static int totalContas;
    
    public Conta() {
        totalContas++;
    }
    
    public int getTotalContas() {
        return totalContas;
    }
    
    public static int getTotalContasStatic() {
        return totalContas;
    }
}
