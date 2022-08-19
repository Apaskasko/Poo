import java.util.Scanner;

public class baskara {

    Scanner read = new Scanner(System.in);

    int a, b, c;
    double delta, x1, x2;

    public baskara() {
        deltaCalculo();
    }

    private void deltaCalculo() {

        System.out.printf("Coeficiente a: ");
        a = Integer.parseInt(read.next());
        System.out.printf("Coeficiente b: ");
        b = Integer.parseInt(read.next());
        System.out.printf("Coeficiente c: ");
        c = Integer.parseInt(read.next());

        delta = (b * b) + (-4 * (a * c));

        System.out.println("Delta: " + delta);

        if (delta >= 0) {
            calculaX();
        } else {
            System.out.println("Esta equação não possui raízes reais!");
            System.exit(0);
        }

    }

    private void calculaX() {

        x1 = (double) ((-(b) + Math.sqrt(delta)) / 2 * a);
        x2 = (double) ((-(b) - Math.sqrt(delta)) / 2 * a);

        System.out.printf("X1 = %.4f", x1);
        System.out.printf("%nX2 = %.4f", x2);

    }

    public static void main(String[] args) {
        new baskara();
    }

}