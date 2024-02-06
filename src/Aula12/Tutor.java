
package Aula12;

import java.util.ArrayList;


public class Tutor {
    private String nome;
    private ArrayList<Pet> lstPets;

    public Tutor() {
        lstPets = new ArrayList<>();
    }

    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public void addPet(Pet pet) {
        lstPets.add(pet);
    }
    
    public void removePet(Pet chisburnio) {
        lstPets.remove(chisburnio);
    }

    public ArrayList<Pet> getLstPets() {
        return lstPets;
    }
    
}
