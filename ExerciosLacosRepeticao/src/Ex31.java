import java.util.*;

public class Ex31 {
    public static void main(String[] args) {
        List<Integer> lista1 = Arrays.asList(1, 3, 5, 7);
        List<Integer> lista2 = Arrays.asList(2, 4, 6, 8);
        List<Integer> intercalada = new ArrayList<>();

        int tamanho = Math.max(lista1.size(), lista2.size());

        for (int i = 0; i < tamanho; i++) {
            if (i < lista1.size()) intercalada.add(lista1.get(i));
            if (i < lista2.size()) intercalada.add(lista2.get(i));
        }

        System.out.println(intercalada);
    }
}
