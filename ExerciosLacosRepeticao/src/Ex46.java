public class Ex46 {
    public static boolean ehArmstrong(int num) {
        int soma = 0, temp = num, digitos = String.valueOf(num).length();
        while (temp > 0) {
            soma += Math.pow(temp % 10, digitos);
            temp /= 10;
        }
        return soma == num;
    }

    public static void main(String[] args) {
        int num = 153;
        System.out.println(num + " é Armstrong? " + ehArmstrong(num));
    }
}
