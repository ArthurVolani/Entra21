import java.util.*;

public class Ex33 {
    public static void main(String[] args) {
        List<Integer> lista1 = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> lista2 = Arrays.asList(3, 4, 5, 6, 7);
        lista1.retainAll(lista2);

        System.out.println("Elementos comuns: " + lista1);
    }
}