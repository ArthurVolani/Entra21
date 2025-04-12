package listaexexercicios;

import java.util.Scanner;

public class Ex07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
int N = sc.nextInt();
int soma = 0;
while (N > 0) {
soma += N % 10;
N /= 10;
}
System.out.println("Soma dos dígitos: " + soma);
    }
    
}
