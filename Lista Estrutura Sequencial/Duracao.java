import java.util.Scanner;
 
 // 10. Problema "Duracao"
 // Fazer um programa para ler uma duração de tempo em segundos, daí imprimir na tela esta duração no formato horas:minutos:segundos.
 
 public class Duracao {
    public static void main(String[] args) throws Exception {
        int segundos,h,resto,m,s;
        Scanner sc = new Scanner(System.in);
        
        System.out.printf("Digite a duração em segundos: ");
        segundos = sc.nextInt();
        h = segundos / 3600;
        resto = segundos % 3600;
        m = resto/60;
        s = resto % 60;
        System.out.printf("%d:%d:%d\n", h, m, s);
        sc.close();
    }
}