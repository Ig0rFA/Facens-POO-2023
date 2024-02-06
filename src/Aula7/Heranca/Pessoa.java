package Aula7.Heranca;

public class Pessoa {
    private String cpf;
    private String nome;

    public Pessoa() {
    }

    
    public Pessoa(String cpf, String nome) {
        this.cpf = cpf;
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public String imprimir() {
        return "\nNome: "+nome+
                "\nCPF: "+cpf;
    }
}
