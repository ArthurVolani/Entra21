package listaexexercicios;

import java.util.Scanner;

public class Ex06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
int N = sc.nextInt();
int fat = 1;
for (int i = 2; i <= N; i++) {
fat *= i;
}
System.out.println("Fatorial: " + fat);
    }
    
}
