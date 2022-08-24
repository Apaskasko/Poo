import java.util.Locale;
import java.util.Scanner;

public class temperatura {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);
        System.out.printf("Voce vai digitar a temperatura em qual escala (C/F) ?");
        String Escolha = sc.nextLine();
        if (Escolha.equals("C")) {
            System.out.printf("Digite a temperatura em Celcius: ");
            float C1 = sc.nextFloat();
            float F1 = (C1 * 9/5 + 32);
            System.out.printf("Temperatura equivalente em Fahrenheit = %.2f", F1);
        } else if (Escolha.equals("F")) {
            System.out.printf("Digite a temperatura em Fahrenheit: ");
            float F2 = sc.nextFloat();
            float C2 ;
            C2 = ((F2-32)*5/9);
            System.out.printf("Temperatura equivalente em Celcius = %.2f", C2);
        } else {
            System.out.println("Error.");
        }
        sc.close();
    }
}
