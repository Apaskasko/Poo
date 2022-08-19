import java.util.Locale;
import java.util.Scanner;

public class glicose {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.printf("Digite a media da glicose: ");
        double medida = sc.nextDouble();
        if (medida <= 100){
            System.out.println("Classificação : Normal");
        } else if (medida > 100 && medida <= 140){
            System.out.println("Classificação : Elevado");
        } else if (medida > 140){
            System.out.println("Classificação : Diabetes");
        } else{
            System.out.println("Valor inválido");
        }
        sc.close();

    }
}
