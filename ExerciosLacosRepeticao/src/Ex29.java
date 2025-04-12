import java.util.*;

public class Ex29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite uma palavra:");
        String palavra = sc.next().toLowerCase();

        String invertida = new StringBuilder(palavra).reverse().toString();
        if (palavra.equals(invertida)) {
            System.out.println("É um palíndromo!");
        } else {
            System.out.println("Não é um palíndromo.");
        }
    }
}
