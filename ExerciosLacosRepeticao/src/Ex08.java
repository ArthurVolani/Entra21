package listaexexercicios;

import java.util.Scanner;

public class Ex08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
int N = sc.nextInt();
boolean primo = true;
if (N <= 1) primo = false;
for (int i = 2; i <= Math.sqrt(N); i++) {
if (N % i == 0) {
primo = false;
break;
}
}
System.out.println(primo ? "É primo" : "Não é primo");
    }
    
}
