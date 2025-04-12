import java.util.*;

public class Ex28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o valor de N:");
        int n = sc.nextInt();

        int soma = 0;
        for (int i = 1; i <= n; i++) {
            soma += i * i;
        }

        System.out.println("Soma dos quadrados: " + soma);
    }
}
