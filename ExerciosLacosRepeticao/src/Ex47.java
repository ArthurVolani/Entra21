import java.util.*;

public class Ex47 {
    public static boolean ehPrimo(int num) {
        if (num < 2) return false;
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        int A = 10, B = 50, count = 0;
        for (int i = A; i <= B; i++) {
            if (ehPrimo(i)) count++;
        }
        System.out.println("Quantidade de primos: " + count);
    }
}
