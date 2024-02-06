package Aula12;

public class MainStatic {
    public static void main(String[] args) {
        Conta conta1 = new Conta();
        System.out.println(conta1.getTotalContas());
        
        Conta conta2 = new Conta();
        System.out.println(conta2.getTotalContas());
        

        Conta.getTotalContasStatic();
    }
}
