package Aula3;

public class MainConstrutor {
    public static void main(String[] args) {
        Aluno alu1 = new Aluno("Fabio", "123", "ADS");
        System.out.println(alu1.getNome());
        
        Pessoa1 pessoa = new Pessoa1("123","Fabio");
        pessoa.setCarteiraMotorista("a899834");
        
        System.out.println(pessoa.imprimir());
        
        Aluno alu = new Aluno("Fabio");
    }
}
