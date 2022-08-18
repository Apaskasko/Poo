import java.util.Scanner;

// 7. Problema "Pagamento"
// Fazer um programa para ler o nome de um(a) funcionário(a), o valor que ele(a) recebe por hora, e a quantidade de horas trabalhadas por ele(a). Ao final, mostrar o valor do pagamento do funcionário com uma mensagem explicativa, conforme exemplo.

public class Pagamento {
    public static void main(String[] args) {

                Scanner sc = new Scanner(System.in);
                double valor,pagamento;
                int horas;
                String nome;
                System.out.printf("Digite o nome do funcionario: ");
                nome = sc.nextLine();
                System.out.printf("Digite o valor recebido por hora: ");
                valor =sc.nextDouble();
                System.out.printf("Digite o valor de horas trabalhadas: ");
                horas =sc.nextInt();
                pagamento = valor*horas;
                System.out.printf("O pagamento para %s deve ser: ",nome);
                System.out.printf("%.2f",pagamento);
                sc.close();
            }
        }

