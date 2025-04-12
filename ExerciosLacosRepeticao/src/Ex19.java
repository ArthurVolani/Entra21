import java.util.ArrayList;
import java.util.Scanner;

public class Ex19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> numeros = new ArrayList<>();

        System.out.print("Quantos números deseja inserir? ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print("Digite um número: ");
            numeros.add(sc.nextInt());
        }

        for (int i = 0; i < numeros.size(); i++) {
            numeros.set(i, numeros.get(i) * 2);
        }

        System.out.println("Lista com valores duplicados: " + numeros);
    }
}
