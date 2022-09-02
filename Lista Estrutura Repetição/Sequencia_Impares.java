package lista3;

/*
 * Leia um valor inteiro X. Em seguida mostre os ímpares de 1 até X, um valor por linha,
inclusive o X, se for o caso.
 */
import java.util.Scanner;

public class Sequencia_Impares {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Digite o valor de X: ");
        int num = sc.nextInt();

        for (int i = 0; i <= num; i++) {
            if (i % 2 == 1) {
                System.out.println(i);
            }

        }
        sc.close();
    }

}