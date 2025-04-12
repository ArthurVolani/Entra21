import java.util.*;

public class Ex25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> numeros = new ArrayList<>();

        System.out.println("Digite a quantidade de números:");
        int n = sc.nextInt();

        System.out.println("Digite os números:");
        for (int i = 0; i < n; i++) {
            numeros.add(sc.nextInt());
        }

        System.out.println("Digite o valor fixo para multiplicação:");
        int x = sc.nextInt();

        for (int i = 0; i < numeros.size(); i++) {
            numeros.set(i, numeros.get(i) * x);
        }

        System.out.println("Lista multiplicada: " + numeros);
    }
}
