package Aula12;

public class MainAssociocao {
    public static void main(String[] args) {
        Tutor tut = new Tutor();
        tut.setNome("Fabio");
        
        Pet maria = new Pet();
        Pet chico = new Pet();
        
        tut.addPet(maria);
        tut.addPet(chico);
        
        tut.getLstPets();
    }
}
