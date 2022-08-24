import java.util.Locale;
import java.util.Scanner;

public class Aumento {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.printf("Digite o salário da pessoa: ");
        double salario = sc.nextDouble();
        if (salario <= 1000) {
            double novoSalario = salario * 120 / 100;
            System.out.printf("Novo salário = R$ %.2f%n", novoSalario);
            double aumento = novoSalario - salario;
            System.out.printf("Aumento = R$ %.2f%n", aumento);
            System.out.printf("Porcentagem = 20%%");
        } else if ((salario > 1000) && (salario <= 3000)) {
            double novoSalario = salario * 115 / 100;
            System.out.printf("Novo salário = R$ %.2f%n", novoSalario);
            double aumento = novoSalario - salario;
            System.out.printf("Aumento = R$ %.2f%n", aumento);
            System.out.printf("Porcentagem = 15%%");
        } else if ((salario > 3000) && (salario <= 8000)) {
            double novoSalario = salario * 110 / 100;
            System.out.printf("Novo salário = R$ %.2f%n", novoSalario);
            double aumento = novoSalario - salario;
            System.out.printf("Aumento = R$ %.2f%n", aumento);
            System.out.printf("Porcentagem = 10%%");
        } else if (salario > 8000) {
            double novoSalario = salario * 105 / 100;
            System.out.printf("Novo salário = R$ %.2f%n", novoSalario);
            double aumento = novoSalario - salario;
            System.out.printf("Aumento = R$ %.2f%n", aumento);
            System.out.printf("Porcentagem = 5%%");
        }

        sc.close();
    }

}
