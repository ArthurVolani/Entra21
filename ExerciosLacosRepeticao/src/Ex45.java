public class Ex45 {
    public static boolean ehPerfeito(int num) {
        int soma = 0;
        for (int i = 1; i < num; i++) {
            if (num % i == 0) soma += i;
        }
        return soma == num;
    }

    public static void main(String[] args) {
        int num = 6;
        System.out.println(num + " é perfeito? " + ehPerfeito(num));
    }
}