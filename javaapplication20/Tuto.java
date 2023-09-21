
package javaapplication20;

import java.util.ArrayList;

public class Tuto {
        private String nome;
        private String cpf;
        private ArrayList<Pet> lstPets;
 
        public Tuto(String nome , String cpf) {
         lstPets = new ArrayList<>();
        this.nome = nome;
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
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
        String str = "\nNome: "+nome+
                "\nCPF: "+ getCpf();
        
        for (Pet p : lstPets) {
            str += p.imprimir();
        }
        
        return str;
    }
}
