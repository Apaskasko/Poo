import java.util.Scanner;

    // 8. Problema "Consumo"
    // Fazer um programa para ler a distância total (em km) percorrida por um carro, bem como o total de combustível gasto por este carro ao percorrer tal distância. Seu programa deve mostrar o consumo médio do carro, com três casas decimais.
public class Consumo {
    public static void main(String[] args) {
        double consumo,combustivel;
        int distancia;
        Scanner sc = new Scanner(System.in);

        System.out.printf("Distancia Percorrida: ");
        distancia = sc.nextInt();
        System.out.printf("Combustivo gasto: ");
        combustivel = sc.nextDouble();

        consumo = distancia / combustivel;

        System.out.printf("Consumo medio = ");
        System.out.printf("%.3f",consumo);
        sc.close();
    }
}
