import java.util.*;

public class Ex34 {
    public static void main(String[] args) {
        List<Integer> lista1 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        List<Integer> lista2 = Arrays.asList(3, 4);

        lista1.removeAll(lista2);
        System.out.println("Lista após remoção: " + lista1);
    }
}