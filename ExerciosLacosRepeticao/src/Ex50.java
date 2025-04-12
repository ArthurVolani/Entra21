import java.util.*;

public class Ex50 {
    public static void main(String[] args) {
        List<Integer> lista = Arrays.asList(1, 2, 2, 3, 4, 1, 2, 3, 4, 5, 6);
        int max = 1, count = 1;

        for (int i = 1; i < lista.size(); i++) {
            if (lista.get(i) > lista.get(i - 1)) {
                count++;
                max = Math.max(max, count);
            } else {
                count = 1;
            }
        }

        System.out.println("Maior sequência crescente: " + max);
    }
}