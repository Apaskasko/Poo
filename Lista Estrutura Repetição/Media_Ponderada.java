package lista3;

import java.util.Locale;

/*
 * Leia um valor inteiro N, que representa o número de casos de teste que vem a seguir.Cada caso de teste consiste de 3 valores reais, para os quais você deverá calcular e mostrar a média ponderada, sendo que o primeiro valor tem peso 2, o segundo valor tem peso 3 e o terceiro valor tem peso 5. Vale lembrar que a média ponderada é a soma de todos os valores multiplicados pelo seu respectivo peso, dividida pela soma dos pesos.
 */

import java.util.Scanner;
import java.text.DecimalFormat;

public class Media_Ponderada {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        System.out.printf("Quantos casos você vai digitar? ");
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.0");
        double N;
        double p1, p2, p3, media;
        N = sc.nextInt();

        for (double i = 0; i < N; i++) {
            System.out.println("Digite "+N+" numeros:");
            p1 = sc.nextDouble();
            p2 = sc.nextDouble();
            p3 = sc.nextDouble();
            media = (2 * p1 + 3 * p2 + 5 * p3) / 10;
            System.out.println("MEDIA = " + df.format(media));
        }
        sc.close();
    }
}