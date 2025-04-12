import java.util.*;

public class Ex30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número:");
        int num = sc.nextInt();

        int digitos = String.valueOf(num).length();
        System.out.println("Número de dígitos: " + digitos);
    }
}
