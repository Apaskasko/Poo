import java.util.Locale;
import java.util.Scanner;

public class lanchonete {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);
        System.out.printf("Codigo do produto comprado: ");
        int Codigo = sc.nextInt();
        float Code1 = 10;
        float Code2 = 20;
        float Code3 = 30;
        float Code4 = 40;
        if (Codigo == 1) {
            System.out.printf("Quantidade comprada: ");
            int quantidade = sc.nextInt();
            float Total = Code1 * quantidade;
            System.out.printf("Valor a pagar: R$ %.2f", Total);
        } else if (Codigo == 2) {
            System.out.printf("Quantidade comprada: ");
            int quantidade = sc.nextInt();
            float Total = Code2 * quantidade;
            System.out.printf("Valor a pagar: R$ %.2f", Total);
        } else if (Codigo == 3) {
            System.out.printf("Quantidade comprada: ");
            int quantidade = sc.nextInt();
            float Total = Code3 * quantidade;
            System.out.printf("Valor a pagar: R$ %.2f", Total);
        } else if (Codigo == 4) {
            System.out.printf("Quantidade comprada: ");
            int quantidade = sc.nextInt();
            float Total = Code4 * quantidade;
            System.out.printf("Valor a pagar: R$ %.2f", Total);
        } else {
            System.out.println("Produto não Cadastrado");
        }
        sc.close();

    }

}
