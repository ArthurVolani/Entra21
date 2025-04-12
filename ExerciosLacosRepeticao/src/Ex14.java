import java.util.ArrayList;
import java.util.Scanner;

public class Ex14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> numeros = new ArrayList<>();
        int contadorPares = 0;

        System.out.print("Quantos números deseja inserir? ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print("Digite um número: ");
            int num = sc.nextInt();
            numeros.add(num);
            if (num % 2 == 0) {
                contadorPares++;
            }
        }
        System.out.println("Quantidade de números pares: " + contadorPares);
    }
}
