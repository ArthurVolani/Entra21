import java.util.*;

public class Ex20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> numeros = new ArrayList<>();
        
        System.out.println("Digite a quantidade de números:");
        int n = sc.nextInt();

        System.out.println("Digite os números:");
        for (int i = 0; i < n; i++) {
            numeros.add(sc.nextInt());
        }

        Collections.sort(numeros);
        System.out.println("Lista ordenada em ordem crescente: " + numeros);
    }
}
