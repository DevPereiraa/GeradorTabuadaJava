import java.util.Scanner;

public class GeradorTabuada {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número de 1 a 20 para gerar a tabuada: ");
        int num = sc.nextInt();


        System.out.println("\nTabuada de " + num + ": ");
        for (int i = 1; i <= 20; i++) {
            System.out.println(num + " x " + i + " = " + (num * i));
        }


        System.out.println("Deseja gerar todas as tabuadas de 1 a 20? (S/N)");
        String resp = sc.next().toUpperCase();

        if (resp.equals("S")) {
            System.out.println("\nTabuadas de 1 a 20: ");
            for (int n = 1; n <= 20; n++) {
                System.out.println("\nTabuada de " + n + ": ");
                for (int i = 1; i <= 20; i++) {
                    System.out.println(n + " x " + i + " = " + (n * i));
                }
            }
        } else {
            System.out.println("Programa encerrado!");
        }

        sc.close();
    }
}
