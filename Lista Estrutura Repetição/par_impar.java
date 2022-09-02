/*
 * Leia um valor inteiro N. Este valor será a quantidade de números inteiros que
 * serão lidos em seguida. Para cada valor lido, mostre uma mensagem dizendo se
 * este valor lido é PAR ou ÍMPAR, e também se é POSITIVO ou NEGATIVO. No caso
 * do valor ser igual a zero (0), seu programa deverá imprimir apenas NULO.
 */

package lista3;

import java.util.Scanner;

public class par_impar {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N, X;
        System.out.printf("Quantos numeros vai digitar? ");
        N = sc.nextInt();

        for (int i = 0; i < N; i++) {
            System.out.printf("Digite um número: ");
            X = sc.nextInt();
            if (X == 0) {

                System.out.println("NULO");
            } else {
                if (X % 2 == 0) {
                    System.out.print("PAR ");
                } else {
                    System.out.print("IMPAR ");
                }
                if (X > 0) {
                    System.out.println("POSITIVO");
                } else {
                    System.out.println("NEGATIVO");
                }
            }
            sc.close();
        }
    }
}