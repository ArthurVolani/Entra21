import java.util.*;

public class Ex44 {
    public static void main(String[] args) {
        List<Integer> lista = new ArrayList<>();
        Random rand = new Random();
        for (int i = 0; i < 10; i++) {
            lista.add(rand.nextInt(100));
        }
        System.out.println("Lista: " + lista);
        lista.sort(Collections.reverseOrder());
        System.out.println("Três maiores: " + lista.subList(0, 3));
    }
}