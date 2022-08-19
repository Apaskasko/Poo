import java.util.Locale;
import java.util.Scanner;

public class troco_verificado {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.printf("Preço unitario do produto: ");
        double preco = sc.nextDouble();
        System.out.printf("Quantidade comprada: ");
        double quantidade = sc.nextDouble();
        System.out.printf("Dinheiro Recebido: ");
        double dinheiro = sc.nextDouble();

        double troco = (dinheiro - (preco * quantidade));
        if (dinheiro < (preco * quantidade)) {
            System.out.printf("DINHEIRO INSUFICIENTE. FALTAM %.2f REAIS", (troco*-1));
        } else {
            System.out.printf("TROCO = %.2f", troco);
        }
        sc.close();
    }
}
