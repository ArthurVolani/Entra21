import java.util.*;

public class Ex38 {
    public static void main(String[] args) {
        Random rand = new Random();
        Set<Integer> numeros = new LinkedHashSet<>();

        while (numeros.size() < 5) {
            numeros.add(rand.nextInt(50) + 1);
        }

        System.out.println("Lista gerada: " + numeros);
    }
}
