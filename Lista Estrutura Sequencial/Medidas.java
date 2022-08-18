import java.util.Scanner;

// 9. Problema “medidas”
// Fazer um programa para ler três medidas A, B e C. Em seguida, calcular e mostrar (imprimir os dados com quatro casas decimais): a) a área do quadrado que tem lado A b) a área do triângulo retângulo que base A e altura B c) a área do trapézio que tem bases A e B, e altura C

public class Medidas {

    public static void main(String[] args) {
        double a,b,c,areaQuadrado,areaTriangulo,areaTrapezio;
        Scanner sc = new Scanner(System.in);
        System.out.printf("Digite a medida de A: ");
        a = sc.nextDouble();
        System.out.printf("Digite a medida de B: ");
        b = sc.nextDouble();
        System.out.printf("Digite a medida de C: ");
        c = sc.nextDouble();
        System.out.println("-=-=-=-=-=-");
        areaQuadrado = a*a;
        areaTriangulo = (b*a)/2;
        areaTrapezio = (a+b)*c/2;
        System.out.printf("Area do Quadrado = ");
        System.out.printf("%.4f%n",areaQuadrado);
        System.out.printf("Area do Triangulo = ");
        System.out.printf("%.4f%n",areaTriangulo);
        System.out.printf("Area do Trapezio = ");
        System.out.printf("%.4f",areaTrapezio);

        sc.close();
    }

}
