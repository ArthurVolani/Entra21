import java.util.ArrayList;
import java.util.Scanner;

public class Ex16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> numeros = new ArrayList<>();

        System.out.print("Quantos números deseja inserir? ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print("Digite um número: ");
            numeros.add(sc.nextInt());
        }

        System.out.print("Digite o número a ser buscado: ");
        int x = sc.nextInt();

        if (numeros.contains(x)) {
            System.out.println("O número " + x + " está na lista.");
        } else {
            System.out.println("O número " + x + " não está na lista.");
        }
    }
}
