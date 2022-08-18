import java.util.Scanner;

    // 6. Problema "Circulo"
    // Fazer um programa para ler o valor "r" do raio de um círculo, e depois mostrar o valor da área do círculo com três casas decimais. A fórmula da área do círculo é a seguinte: area = π. r . Você pode usar o valor de π fornecido pela biblioteca da sua linguagem de programação, ou então, se preferir, use diretamente o valor 3.14159.
public class Circulo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double raio,area;
        System.out.printf("Digite o valor do raio do circulo: ");
        raio = sc.nextDouble();
        area = Math.PI*(raio*raio);
        System.out.printf("Area: ");
        System.out.printf("%.3f",area);
        sc.close();
    }
}