import java.util.Scanner;

public class menor_de_tres {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.printf("Primeiro valor: ");
        int valor1 = sc.nextInt();
        System.out.printf("Segundo valor: ");
        int valor2 = sc.nextInt();
        System.out.printf("Terceiro valor: ");
        int valor3 = sc.nextInt();
        if ((valor1 < valor2) && (valor1 < valor3) || valor1 == valor2 || valor1 == valor3){
            System.out.printf("Menor: %d",valor1);
        } else if ((valor2 < valor1) && (valor2 < valor3) || valor2 == valor1 || valor2 == valor3){
            System.out.printf("Menor: %d",valor2);
        } else if ((valor3 < valor1) && (valor3 < valor2 || valor3 == valor1 || valor3 == valor2)){
            System.out.printf("Menor: %d",valor3);   
        } else {
            System.out.println("");
        }
        
        sc.close();
    }
}
