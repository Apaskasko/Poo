import java.util.Scanner;

public class operadora {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Digite a quantidade de minutos: ");
        int min = sc.nextInt();
        int valor;
        if (min<100) {
            valor = 50;
            System.out.printf("Valor a pagar: R$ %s.00",valor);
        } else {
            valor = (((min-100)*2)+50);
            System.out.printf("Valor a pagar: R$ %s.00", valor);
            sc.close();
        }
    }
}
