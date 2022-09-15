import java.util.Locale;
import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) throws Exception {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int n = 0, contador = 0;
        double soma = 0.0;
        // while
        System.out.println("Digite as idades: ");
        while (n >= 0) {
            n = sc.nextInt();
            if (n >= 0) {
                contador++;
                soma += n;
            } else if (contador == 0 && n < 1) {
                System.out.println("impossivel Calcular");
                contador = 0;
                n = 0;
            }
        }
        double media = soma / contador;
        System.out.println(String.format("%.2f", media));

        sc.close();
    }

}
