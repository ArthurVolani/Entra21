import java.util.*;

public class Ex52 {
    public static void main(String[] args) {
        int[][] matriz = {{1, 2, 3}, {4, 1, 6}, {1, 2, 2}};
        Map<Integer, Integer> freq = new HashMap<>();
        for (int[] linha : matriz)
            for (int num : linha)
                freq.put(num, freq.getOrDefault(num, 0) + 1);

        int maisFrequente = Collections.max(freq.entrySet(), Map.Entry.comparingByValue()).getKey();
        System.out.println("Número mais frequente: " + maisFrequente);
    }
}