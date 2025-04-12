package listaexexercicios;

import java.util.Scanner;

public class Ex09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
int N = sc.nextInt();
int a = 0, b = 1;
for (int i = 0; i < N; i++) {
System.out.print(a + " ");
int temp = a + b;
a = b;
b = temp;
}
    }
    
}
