import java.util.Locale;
import java.util.Scanner;

public class tempo_de_jogo {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.printf("Hora inicial: ");
        int hInit = sc.nextInt();
        System.out.printf("Hora final: ");
        int hFin = sc.nextInt();
        if (hInit == 1 && hFin <= 2) {
            System.out.println("O JOGO TEVE A DURAÇÃO MÍNIMA DE : 1 HORA");
        } else if (hInit > 1 && hFin > 2) {
            int horas = hFin - hInit;
            System.out.printf("O JOGO DUROU " + horas + " HORAS");
        } else if (hInit > 24 || hFin > 24) {
            System.out.println("DIGITE UM VALOR EQUIVALENTE, DE 1 A 24 (HORAS)");
        } else if (hInit > hFin) {
            int horas = 24 - hInit + hFin;
            System.out.println("O JOGO DUROU " + horas + " HORAS");
        } else if (hInit == 0 && hFin == 0) {
            int horas = 24;
            System.out.println("O JOGO DUROU " + horas + " HORAS");
        } else {
            System.out.println("error");
        }
        sc.close();
    }
}