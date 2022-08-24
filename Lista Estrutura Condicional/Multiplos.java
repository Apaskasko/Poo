import java.util.Locale;
import java.util.Scanner;

public class Multiplos {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite dois numeros inteiros: ");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();

        if (n1 % n2 == 0 || n2 % n1 == 0) {
            System.out.println("São múltiplos");

        } else {
            System.out.println("Não são múltiplos");
        }
        sc.close();
    }
}