import java.util.Locale;
import java.util.Scanner;

/*
 * Faça um programa para ler um número indeterminado de dados, contendo cada um, a
idade de um indivíduo. O último dado, que não entrará nos cálculos, contém um valor
de idade negativa. Calcular e imprimir a idade média deste grupo de indivíduos. Se for
entrado um valor negativo na primeira vez, mostrar a mensagem "IMPOSSIVEL
CALCULAR".
 */
public class Media_Idades {
    public static void main(String[] args) throws Exception {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int n = 0, contador = 0;
        double soma = 0.0;
        // while
        System.out.println("Digite as idades: ");
        while (n >= 0) {
            n = sc.nextInt();
            if (n >= 0) {
                contador++;
                soma += n;
            } else if (contador == 0 && n < 1) {
                System.out.println("impossivel Calcular");
                contador = 0;
                n = 0;
            }
        }
        double media = soma / contador;
        System.out.println(String.format("%.2f", media));

        sc.close();
    }

}
