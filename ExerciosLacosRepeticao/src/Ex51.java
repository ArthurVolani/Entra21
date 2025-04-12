import java.util.*;

public class Ex51 {
    public static void main(String[] args) {
        List<Integer> lista = new ArrayList<>(Arrays.asList(10, 5, 8, 20, 15));
        int X = 2;
        lista.sort(Comparator.naturalOrder());
        lista = lista.subList(X, lista.size());
        System.out.println(lista);
    }
}