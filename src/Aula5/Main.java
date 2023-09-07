package Aula5;

public class Main {
    public static void main(String[] args) {
        int[] idades = {2,4,6};
        System.out.println(idades[0]);
        
        int[] idadesCopy = idades;
        idadesCopy[0] = 1;
        System.out.println(idades[0]);
    }
}
