package lista3;

/*
Leia um valor inteiro N. Este valor será a quantidade de valores inteiros X que serão
lidos em seguida. Mostre quantos destes valores X estão dentro do intervalo [10,20] e
quantos estão fora do intervalo, conforme exemplo.
*/

import java.io.IOException;
import java.util.Scanner;

public class Dentro_Fora {

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        System.out.println("Quantos números voce vai digitar?");
        int N = sc.nextInt();
        int in = 0;
        int out = 0;
        for (int i = 0; i < N; i++) {
            System.out.println("Digite um número :");
            int x = sc.nextInt();
            if (x >= 10 && x <= 20)
                in++;
            else
                out++;
        }
        System.out.println(in + " DENTRO");
        System.out.println(out + " FORA");
        sc.close();
    }

}