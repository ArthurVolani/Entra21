import java.util.*;

public class Ex40 {
    public static void main(String[] args) {
        List<Integer> lista1 = Arrays.asList(1, 3, 5);
        List<Integer> lista2 = Arrays.asList(2, 4, 6);
        List<Integer> mesclada = new ArrayList<>(lista1);

        mesclada.addAll(lista2);
        Collections.sort(mesclada);
        System.out.println(mesclada);
    }
}
