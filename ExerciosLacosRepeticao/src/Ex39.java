import java.util.*;

public class Ex39 {
    public static void main(String[] args) {
        List<Integer> lista = Arrays.asList(1, 2, 2, 3, 3, 3, 4);
        Map<Integer, Integer> frequencia = new HashMap<>();

        for (int num : lista) {
            frequencia.put(num, frequencia.getOrDefault(num, 0) + 1);
        }

        System.out.println("Frequência dos números: " + frequencia);
    }
}
