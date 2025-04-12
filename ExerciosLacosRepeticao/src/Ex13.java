import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Ex13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> numeros = new ArrayList<>();

        System.out.print("Quantos números deseja inserir? ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print("Digite um número: ");
            numeros.add(sc.nextInt());
        }

        int maior = Collections.max(numeros);
        int menor = Collections.min(numeros);

        System.out.println("Maior número: " + maior);
        System.out.println("Menor número: " + menor);

    }
}
