package lista3;
import java.util.Locale;
import java.util.Scanner;

/* Faça um programa que leia as notas referentes às duas avaliações de um aluno.
Calcule e imprima a média semestral. Faça com que o algoritmo só aceite notas
válidas (uma nota válida deve pertencer ao intervalo [0,10]). Cada nota deve ser
validada separadamente. */

public class Validacao_de_nota {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        double n, soma = 0.0;
        double c = 0;

        while (c < 2) {
            System.out.println("Digite a nota: ");
            n = sc.nextDouble();
            if (n >= 0 && n <= 10) {
                c++;
                soma += n;
            } else {
                System.out.println("Valor inválido! Tente novamente.");
            }
        }

        System.out.println("media = " + soma * 0.5);
        sc.close();
    }
}