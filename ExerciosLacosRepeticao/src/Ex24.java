import java.util.*;

public class Ex24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> numeros = new ArrayList<>();
        int soma = 0, contador = 0;
        
        System.out.println("Digite a quantidade de números:");
        int n = sc.nextInt();

        System.out.println("Digite os números:");
        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();
            if (num % 2 != 0) {
                soma += num;
                contador++;
            }
            numeros.add(num);
        }

        if (contador > 0) {
            System.out.println("Média dos números ímpares: " + (soma / (double) contador));
        } else {
            System.out.println("Nenhum número ímpar encontrado.");
        }
    }
}