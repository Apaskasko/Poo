import java.util.Scanner;

// 5. Problema "Troco"
// Fazer um programa para calcular o troco no processo de pagamento de um produto de uma mercearia. O programa deve ler o preço unitário do produto, a quantidade de unidades compradas deste produto, e o valor em dinheiro dado pelo cliente (suponha que haja dinheiro suficiente). Seu programa deve mostrar o valor do troco a ser devolvido ao cliente.

public class Troco {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int quantidade;
        double preco,dinheiroRecebido,troco;
        System.out.printf("Preço unitario do produto: ");
        preco = sc.nextInt();
        System.out.printf("Quantidade Comprada: ");
        quantidade = sc.nextInt();
        System.out.printf("Dinheiro Recebido: ");
        dinheiroRecebido = sc.nextDouble();
        troco = dinheiroRecebido-(preco*quantidade);
        System.out.printf("%n -=-=-=-=-=- %nPreço unitario do produto: ");
        System.out.printf("%.2f %n",preco);
        System.out.printf("Quantidade: %s%n",quantidade);
        System.out.printf("Dinheiro Recebido: ");
        System.out.printf("%.2f %n", dinheiroRecebido);
        System.out.printf("Troco = ");
        System.out.printf("%.2f",troco);
        sc.close();
    }
}
