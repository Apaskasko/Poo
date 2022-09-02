package lista3;

/*
O programa deve ler um valor inteiro X indefinidas vezes. (O programa irá parar quando o valor de X for igual a 0). Para cada X lido, imprima a soma dos 5 pares consecutivos a partir de X, inclusive o X , se for par. Se o valor de entrada for 4, por exemplo, a saída deve ser 40, que é o resultado da operação: 4+6+8+10+12, enquanto que se o valor de entrada for 11, por exempo, a saída deve ser 80, que é a soma de 12+14+16+18+20.
*/
import java.util.Scanner;

public class Pares_Consecutivos {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int contadorY = 1, soma = 0, armazenaX = 0;
        while (true) {
            int x = sc.nextInt();
            armazenaX = x;
            if (x % 2 == 0)
                soma += x;
            else {
                armazenaX = x + 1;
                soma += armazenaX;
            }
            while (contadorY < 5) {
                armazenaX += 2;
                soma += armazenaX;
                contadorY++;
            }
            if (x == 0)
                break;
            System.out.println(soma);
            contadorY = 1;
            soma = 0;
        }
        sc.close();
    }
}