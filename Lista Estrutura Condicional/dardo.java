import java.util.Locale;
import java.util.Scanner;

public class dardo {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite as tres distancias: ");
        double dist1 = sc.nextDouble();
        double dist2 = sc.nextDouble();
        double dist3 = sc.nextDouble();

        if ((dist1 > dist2) && (dist1 > dist3)) {
            System.out.printf("Maior distancia = %.2f", dist1);
        }else if ((dist2 > dist1) && (dist2 > dist3)) {
            System.out.printf("Maior distancia = %.2f", dist2);
        }else if ((dist3 > dist1) && (dist3 > dist2)) {
            System.out.printf("Maior distancia = %.2f", dist3);
        } else{
            System.out.println("ERRO");
        }
        sc.close();
    }
}
