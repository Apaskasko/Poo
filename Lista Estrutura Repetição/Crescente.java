package lista3;

import java.io.IOException;
import java.util.Scanner;

public class Crescente {

    /*
     * QUESTÃO 1
     * Leia uma quantidade indeterminada de duplas de valores inteiros X e Y.
     * Escreva para cada X e Y uma mensagem que indique se estes valores foram
     * digitados em ordem crescente ou decrescente. O programa deve finalizar quando
     * forem digitados dois valores iguais.
     */

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite dois números: ");
        int X = sc.nextInt();
        int Y = sc.nextInt();
        while (X != Y) {
            if (X > Y)
                System.out.println("Decrescente\nDigite outros 2 valores: ");
            else
                System.out.println("Crescente\nDigite outros 2 valores: ");
            X = sc.nextInt();
            Y = sc.nextInt();
        }
        sc.close();
    }

}