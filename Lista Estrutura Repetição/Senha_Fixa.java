import java.util.Locale;
import java.util.Scanner;

/* Escreva um programa que repita a leitura de uma senha até que ela seja válida. Para
cada leitura de senha incorreta informada, escreva a mensagem "Senha Inválida! Tente
novamente:". Quando a senha for informada corretamente deve ser impressa a
mensagem "Acesso Permitido" e o algoritmo encerrado. Considere que a senha correta
é o valor 2002.
*/

public class Senha_Fixa {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a senha: ");
        int senha = sc.nextInt();
        while (senha != 2002) {
            System.out.println("Senha inválida! Tente novamente: ");
            senha = sc.nextInt();
        }
        System.out.println("Acesso Permitido!");

        sc.close();
    }

}
