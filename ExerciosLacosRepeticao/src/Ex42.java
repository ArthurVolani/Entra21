import java.util.*;

public class Ex42 {
    public static void main(String[] args) {
        List<Integer> lista = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        Collections.rotate(lista, 1);
        System.out.println(lista);
    }
}