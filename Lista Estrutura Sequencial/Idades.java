import java.util.Scanner;

// 3. Problema "Idades"
// Fazer um programa para ler o nome e idade de duas pessoas. Ao final mostrar uma mensagem com os nomes e a idade média entre essas pessoas, com uma casa decimal, conforme exemplo.

public class Idades {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        String nome1, nome2;
        double media,idade1,idade2;
        System.out.println("Dados da primeira pessoa:");
        System.out.printf("Nome: ");
        nome1 = sc.nextLine();
        System.out.printf("Idade: ");
        idade1 = sc.nextInt();

        System.out.println("Dados da segunda pessoa:");
        System.out.printf("Nome: ");
        nome2 = sc.next(); // DEU ERRO USANDO nexLine ?????
        System.out.printf("Idade: ");
        idade2 = sc.nextInt();

        media = (idade1+idade2)/2;
        System.out.printf("A Idade media de %s e %s é de %s anos",nome1,nome2,media);
        sc.close();

    }
}