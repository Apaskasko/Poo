import java.util.Scanner;

// 1. Problema “Terreno”
// Fazer um programa para ler as medidas da largura e comprimento de um terreno; retangular com uma casa decimal, bem como o valor do metro quadrado do terreno; com duas casas decimais. Em seguida, o programa deve mostrar o valor da área do ; terreno, bem como o valor do preço do terreno, ambos com duas casas decimais, ;conforme exemplo.

public class Terreno {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        double largura, comprimento, metroQ, area, preco ; 
        System.out.printf("Digite a largura do terreno: ");
        largura = sc.nextInt(); // 10.0:

        System.out.printf("Digite o comprimento do terreno: ");
        comprimento = sc.nextInt(); // 30.0

        System.out.printf("Digite o valor do metro quadrado: ");
        metroQ = sc.nextInt(); // 200.00

        area = largura * comprimento;
        preco = area * metroQ; 
        
        System.out.printf("Largura : "+largura+"\n");
        System.out.println("Comprimento : "+comprimento);
        System.out.printf("Valor do Metro Quadrado : ");
        System.out.printf("%.2f%n",metroQ);
        System.out.printf("Área do terreno = ");
        System.out.printf("%.2f%n",area);
        System.out.printf("Preço do terreno = ");
        System.out.printf("%.2f%n",preco);
        
        sc.close();
        } // Main
    } // Class