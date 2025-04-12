import java.util.ArrayList;
import java.util.Scanner;

public class Ex15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> numeros = new ArrayList<>();
        int soma = 0;

        System.out.print("Quantos números deseja inserir? ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print("Digite um número: ");
            int num = sc.nextInt();
            numeros.add(num);
            soma += num;
        }

        double media = (double) soma / n;
        System.out.println("Média dos valores: " + media);
    }
}
