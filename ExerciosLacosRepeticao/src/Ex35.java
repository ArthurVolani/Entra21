import java.util.*;

public class Ex35 {
    public static void main(String[] args) {
        List<Integer> lista1 = Arrays.asList(1, 2, 3);
        List<Integer> lista2 = Arrays.asList(4, 5, 6);
        List<Integer> resultado = new ArrayList<>();

        for (int i = 0; i < lista1.size(); i++) {
            resultado.add(lista1.get(i) * lista2.get(i));
        }

        System.out.println(resultado);
    }
}