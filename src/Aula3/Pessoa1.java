package Aula3;

public class Pessoa1 {
    String nome;
    String cpf;
    String carteiraMotorista;

    public Pessoa1(String cpf, String nome) {
        this.nome = nome;
        this.cpf = cpf;
    }
    
    public String getCarteiraMotorista() {
        return carteiraMotorista;
    }

    public void setCarteiraMotorista(String carteiraMotorista) {
        this.carteiraMotorista = carteiraMotorista;
    }
    
        
    public String imprimir() {
        return "Nome: "+nome+
               "\nCPF: "+cpf+
               "\n Carteira de motorista: "+getCarteiraMotorista();
    }
}
