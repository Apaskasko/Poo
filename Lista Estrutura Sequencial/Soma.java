import java.util.Scanner;

// 4. Problema "Soma"
// Fazer um programa para ler dois valores inteiros X e Y, e depois mostrar na tela o valor da soma destes números.

public class Soma {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x,y,soma;
        System.out.printf("Digite o valor de X: ");
        x = sc.nextInt();
        System.out.printf("Digite o valor de Y: ");
        y = sc.nextInt();
        soma = x+y;
        System.out.printf("Soma = %s",soma );
        sc.close();
    }
}
