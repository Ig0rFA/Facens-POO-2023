package Aula7.Heranca;

public class MainHeranca {
    public static void main(String[] args) {
        Aluno alu1 = new Aluno("Fabio", "1231", "2342");
        
        Professor prof1 = new Professor("Joao", "CPF12312", "12312", 'h', 40000);
        
        System.out.println(alu1.imprimir());
        System.out.println(prof1.imprimir());
    }
}
