import java.util.*;

public class Ex43 {
    public static void main(String[] args) {
        List<Integer> lista = new ArrayList<>(Arrays.asList(10, 20, 5, 30, 15));
        int X = 15;
        lista.removeIf(n -> n > X);
        System.out.println(lista);
    }
}