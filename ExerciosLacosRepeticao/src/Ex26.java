import java.util.*;

public class Ex26 {
    public static boolean ehPrimo(int num) {
        if (num < 2) return false;
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o valor de N:");
        int n = sc.nextInt();

        System.out.println("Números primos até " + n + ":");
        for (int i = 1; i <= n; i++) {
            if (ehPrimo(i)) System.out.print(i + " ");
        }
    }
}