package lista3;

/*
 * Leia 2 valores inteiros X e Y (em qualquer ordem). A seguir, calcule e mostre a soma
dos números ímpares entre eles.
 */
import java.io.IOException;
import java.util.Scanner;

public class Soma_Impares {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int soma = 0;
        System.out.println("Digite dois numeros: ");
        int X = sc.nextInt();
        int Y = sc.nextInt();

        if (X < Y) {
            for (int i = X + 1; i < Y; i++) {
                if (i % 2 != 0) {
                    soma += i;
                }
            }
        } else {
            for (int i = Y + 1; i < X; i++) {
                if (i % 2 != 0) {
                    soma += i;
                }
            }
        }
        System.out.println("Soma dos ímpares = " + soma);
        sc.close();
    }

}