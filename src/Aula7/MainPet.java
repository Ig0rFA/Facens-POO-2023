package Aula7;

public class MainPet {
    public static void main(String[] args) {
        Tutor tut1 = new Tutor("Fabio", "1231231");
        Tutor tut2 = new Tutor("Karine", "34234234");
        
        Pet pet1 = new Pet("Stefani", "Lhasa", 16);
        Pet pet2 = new Pet("Ozzy", "Shitzu", 3);
        
        tut1.addPet(pet1);
        tut1.addPet(pet2);
        
        tut2.addPet(pet2);
        
        System.out.println(tut1.imprimir());
        System.out.println(tut2.imprimir());
    }
}
