package Aula3;

import javax.swing.JOptionPane;

public class Aluno {
    private String nome;
    private String ra;
    private String curso;

    public Aluno() {
        
    }

    public Aluno(String nome) {
        this.nome = nome;
    }

    public Aluno(String nome, String ra, String curso) {
        this.nome = nome;
        this.ra = ra;
        this.curso = curso;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRa() {
        return ra;
    }

    public void setRa(String ra) {
        this.ra = ra;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
    
    public double CalculaMedia(double n1, double n2) {
        return (n1+n2)/2;
    }
    
    public double CalculaMedia(double n1, double n2, double n3, double n4) {
        return (n1+n2+n3+n4)/4;
    }
}
