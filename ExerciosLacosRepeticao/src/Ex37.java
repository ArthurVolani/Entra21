import java.util.*;

public class Ex37 {
    public static void main(String[] args) {
        List<Integer> lista = Arrays.asList(1, 3, 3, 2, 1, 3, 4, 5, 3);
        Map<Integer, Integer> frequencia = new HashMap<>();

        for (int num : lista) {
            frequencia.put(num, frequencia.getOrDefault(num, 0) + 1);
        }

        int moda = Collections.max(frequencia.entrySet(), Map.Entry.comparingByValue()).getKey();
        System.out.println("A moda é: " + moda);
    }
}