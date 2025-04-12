import java.util.*;

public class Ex22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Set<Integer> numeros = new LinkedHashSet<>();
        
        System.out.println("Digite a quantidade de números:");
        int n = sc.nextInt();

        System.out.println("Digite os números:");
        for (int i = 0; i < n; i++) {
            numeros.add(sc.nextInt());
        }

        System.out.println("Lista sem repetidos: " + numeros);
    }
}
