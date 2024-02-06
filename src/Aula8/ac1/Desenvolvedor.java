package Aula8.ac1;

public class Desenvolvedor {
    private String nome;
    private String cpf;
    private char genero;
    private double valorHora;

    public Desenvolvedor() {
    }

    public Desenvolvedor(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
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

    public char getGenero() {
        return genero;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }

    public double getValorHora() {
        return valorHora;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }
    
    public double calculaSalario(int qtdeConsultas) {
        return valorHora * qtdeConsultas;
    }
    
    public String imprimir() {
        return "\n\n======================="+
                "\nNome: "+nome+
                "\nCPF: "+cpf+
                "\nGenero: "+genero+
                "\nValor Hora: "+valorHora;
    }
    
    public String imprimir(int qtdeHoras) {
        String str = imprimir();
        
        str += "\nSalário: "+calculaSalario(qtdeHoras);
        
        return str;
    }
}
