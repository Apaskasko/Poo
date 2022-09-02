package lista3;

import java.util.Scanner;

/*
Ler um número inteiro N, daí mostrar na tela a tabuada de N para 1 a 10, conforme
exemplo.
*/

public class Tabuada {

    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int N;
        System.out.printf("Deseja a tabuada para qual valor? ");
		N = sc.nextInt();

		for (int i=1; i<=10; i++) {
			System.out.println(N + " x " + i + " = " + i*N);
		}
        sc.close();
    }
}