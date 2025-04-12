import java.util.*;

public class Ex27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o valor de N:");
        int n = sc.nextInt();

        int a = 0, b = 1;
        System.out.print("Fibonacci menor que " + n + ": ");
        while (a < n) {
            System.out.print(a + " ");
            int temp = a + b;
            a = b;
            b = temp;
        }
    }
}