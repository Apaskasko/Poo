import java.util.Scanner;

// 2. Problema "Retangulo"
// Fazer um programa para ler as medidas da base e altura de um retângulo. Em seguida; mostrar o valor da área, perímetro e diagonal deste retângulo, com quatro casas ; decimais, conforme exemplos.

public class Retangulo {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        double base, altura, perimetro, area, diagonal;
        System.out.printf("Digite a base do retangulo: ");
        base = sc.nextInt(); // 4.0:

        System.out.printf("Digite o altura do retangulo: ");
        altura = sc.nextInt(); // 5.0

        area = base * altura;
        perimetro = 2*base+2*altura;
        diagonal = Math.sqrt((base*base) + (altura*altura));
        System.out.printf("Area = ");
        System.out.printf("%.4f%n",area);
        System.out.printf("Perimetro = ");
        System.out.printf("%.4f%n",perimetro);
        System.out.printf("Diagonal = ");
        System.out.printf("%.4f",diagonal);
        sc.close();
    }
}