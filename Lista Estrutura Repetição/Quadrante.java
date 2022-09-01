package lista3;

import java.util.Scanner;

/* Escreva um programa para ler as coordenadas (X,Y) de uma quantidade
indeterminada de pontos no sistema cartesiano. Para cada ponto escrever o quadrante
a que ele pertence (Q1, Q2, Q3 ou Q4). O algoritmo será encerrado quando pelo
menos uma de duas coordenadas for NULA (nesta situação sem escrever mensagem
alguma).
*/

public class Quadrante {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x, y;
        System.out.println("Digite os valores das coordenadas X e Y:");
        do {
            x = sc.nextInt();
            y = sc.nextInt();
            if ((x > 0) & (y > 0)) {
                System.out.println("QUADRANTE Q1");
                System.out.println("Digite os valores das coordenadas X e Y:");
            } else if ((x < 0) & (y > 0)) {
                System.out.println("QUADRANTE Q2");
                System.out.println("Digite os valores das coordenadas X e Y:");
            } else if ((x < 0) & (y < 0)) {
                System.out.println("QUADRANTE Q3");
                System.out.println("Digite os valores das coordenadas X e Y:");
            } else if ((x > 0) & (y < 0)) {
                System.out.println("QUADRANTE Q4");
                System.out.println("Digite os valores das coordenadas X e Y:");
            }
        } while ((x != 0) && (y != 0));
        sc.close();
    }
}