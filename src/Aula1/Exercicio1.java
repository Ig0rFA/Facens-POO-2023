package Aula1;

import java.util.Scanner;

public class Exercicio1 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num1, num2;
        char op;

        while (true) {
            System.out.println("Operador");
            op = scan.next().charAt(0);
            
            if (op == 's') {
                System.exit(0);
            }
            
            System.out.println("Numero 1");
            num1 = scan.nextInt();
            System.out.println("Numero 2");
            num2 = scan.nextInt();
            
            int resultado = Calcula(num1, num2, op);
            System.out.println("Resultado: " + resultado);
        } 
    }

    public static int Calcula(int x, int y, char operador) {
        int resultado = 0;

        switch (operador) {
            case '+':
                resultado = x + y;
                break;
            case '-':
                resultado = x - y;
                break;
            case '*':
                resultado = x * y;
                break;
            case '/':
                resultado = x / y;
                break;
        }

        return resultado;
    }
}
