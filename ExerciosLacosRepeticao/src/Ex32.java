import java.util.*;

public class Ex32 {
    public static void main(String[] args) {
        List<Integer> lista1 = Arrays.asList(1, 2, 3);
        List<Integer> lista2 = Arrays.asList(4, 5, 6);
        List<Integer> concatenada = new ArrayList<>(lista1);

        concatenada.addAll(lista2);
        System.out.println(concatenada);
    }
}