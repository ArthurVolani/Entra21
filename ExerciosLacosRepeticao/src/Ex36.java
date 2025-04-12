import java.util.*;

public class Ex36 {
    public static void main(String[] args) {
        List<Integer> lista = Arrays.asList(1, 2, 3, 4, 5);
        boolean ordenada = true;

        for (int i = 1; i < lista.size(); i++) {
            if (lista.get(i) < lista.get(i - 1)) {
                ordenada = false;
                break;
            }
        }

        System.out.println("A lista está ordenada? " + ordenada);
    }
}