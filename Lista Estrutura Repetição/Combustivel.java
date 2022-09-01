package lista3;

import java.util.Scanner;

/* Um posto de combustíveis deseja determinar qual de seus produtos tem a preferência
de seus clientes. Escreva um algoritmo para ler o tipo de combustível abastecido
(codificado da seguinte forma: 1.Álcool 2.Gasolina 3.Diesel 4.Fim). Caso o usuário
informe um código inválido (fora da faixa de 1 a 4) deve ser solicitado um novo código
(até que seja válido). O programa será encerrado quando o código informado for o
número 4, devendo então mostrar a mensagem "MUITO OBRIGADO", bem como as
quantidades de cada combustível. */

public class Combustivel {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        int v[] = new int[3];
        System.out.println("Informe um codigo(1, 2, 3) ou 4 para parar");
        while (n = (sc.nextInt()) && (n != 4)) {
            if (n >= 1 && n <= 3) {
                v[n - 1]++;
            }
        }
        System.out.println("MUITO OBRIGADO");
        System.out.println("Alcool: " + v[0]);
        System.out.println("Gasolina: " + v[1]);
        System.out.println("Diesel: " + v[2]);
        sc.close();
    }

}