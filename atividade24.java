import java.util.Scanner;

public class atividade24 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.print("Quantidade de números a serem digitados? ");
        int n = ler.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.print("Digite o número " + i + ": ");
            while (!ler.hasNextInt()) {
                System.out.println("Por favor, apenas números:");
                ler.next();
            }
            int num = ler.nextInt();
            if (num > 0) {
                System.out.println("O número " + num + " é positivo");
            } else if (num < 0) {
                System.out.println("O número " + num + " é negativo");
            } else {
                System.out.println("O número " + num + " é zero");
            }
        }
    }
}