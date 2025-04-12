import java.util.ArrayList;
import java.util.Scanner;

public class Ex11 {
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {
            System.out.print("Digite um número: ");
            numeros.add(sc.nextInt());
        }

        System.out.println("Lista preenchida: " + numeros);
    }
}