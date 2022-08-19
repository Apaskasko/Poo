import java.util.Scanner;

public class Notas {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a primeira nota:");
        int nota1 = sc.nextInt();
        System.out.println("Digite a segunda nota:");
        int nota2 = sc.nextInt();
        int notafinal = (nota1 + nota2) / 2;
        System.out.printf("NOTA FINAL = %d", notafinal);
        if (notafinal < 60) {
            System.out.println("\nReprovado");

        } else
            System.out.println("\nAprovado");
        sc.close();
    }
}
