package Aula1;

public class MyMain {
    public static void main(String[] args) {
        
        String resultado = CalculaSoma(23, 74);
        System.out.println(resultado);
    
    }
    
    // =========================================
    static String CalculaSoma(int numA, int numB) {
       int result = numA+numB;
       
       return "Resultado: "+ result;
    }
}
