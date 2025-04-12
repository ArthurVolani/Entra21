import java.util.*;

public class Ex48 {
    public static void permutar(List<Integer> lista, int inicio) {
        if (inicio == lista.size() - 1) {
            System.out.println(lista);
            return;
        }
        for (int i = inicio; i < lista.size(); i++) {
            Collections.swap(lista, inicio, i);
            permutar(lista, inicio + 1);
            Collections.swap(lista, inicio, i);
        }
    }

    public static void main(String[] args) {
        List<Integer> lista = Arrays.asList(1, 2, 3);
        permutar(new ArrayList<>(lista), 0);
    }
}