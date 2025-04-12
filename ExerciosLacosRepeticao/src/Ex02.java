package listaexexercicios;

import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int soma = 0;
        for (int i = 1; i <= N; i++) {
        soma += i;
        }
        System.out.println("Soma: " + soma);
    }
    
}
