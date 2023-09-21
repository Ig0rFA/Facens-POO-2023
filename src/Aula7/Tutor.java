
package Aula7;

import java.util.ArrayList;

/*
    1- Cadastrar Tutor
    2- Pet (pergunta quem e o Tutor? (CPF)
    3- Listar Tutores com pets

*/
public class Tutor {
    private String nome;
    private String cpf;
    private ArrayList<Pet> lstPets;

    public Tutor() {
        lstPets = new ArrayList<>();
    }

    public Tutor(String nome, String cpf) {
        this();
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
    
    public ArrayList<Pet> getLstPet() {
        return lstPets;
    }
    
    public void addPet(Pet pet) {
        lstPets.add(pet);
    }
    
    public void removePet(Pet pet) {
        lstPets.remove(pet);
    }
    
    public void removePet(int index) {
        lstPets.remove(index);
    }
    
    public String imprimir() {
        String str = "\n\nNome: "+nome+
                "\nCPF: "+cpf;
        
        for (Pet p : lstPets) {
            str += p.imprimir();
        }
        
        return str;
    }
    
}
