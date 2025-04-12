import java.util.ArrayList;
import java.util.Scanner;

public class Ex12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> numeros = new ArrayList<>();

        System.out.print("Quantos números deseja inserir? ");
        int n = sc.nextInt();

        int soma = 0;
        for (int i = 0; i < n; i++) {
            System.out.print("Digite um número: ");
            int num = sc.nextInt();
            numeros.add(num);
            soma += num;
        }

        System.out.println("Soma dos números: " + soma);
    }
}
