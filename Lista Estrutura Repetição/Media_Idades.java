package lista3;

import java.util.Scanner;

/* Faça um programa para ler um número indeterminado de dados, contendo cada um, a
idade de um indivíduo. O último dado, que não entrará nos cálculos, contém um valor
de idade negativa. Calcular e imprimir a idade média deste grupo de indivíduos. Se for
entrado um valor negativo na primeira vez, mostrar a mensagem "IMPOSSIVEL
CALCULAR".
*/

public class Media_Idades {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 0, count = 0;
        double s = 0.0;
        System.out.println("Digite as idades:");
        while (n >= 0) {
            if (n >= 0)
                s += n;
            count++;
            n = sc.nextInt();
        }
        System.out.println(s / (count - 1));
        sc.close();
    }
}