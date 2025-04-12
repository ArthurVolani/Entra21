import java.util.*;

public class Ex49 {
    public static void main(String[] args) {
        List<Integer> lista = Arrays.asList(10, 5, 8, 20, 15);
        int max1 = Integer.MIN_VALUE, max2 = Integer.MIN_VALUE, max3 = Integer.MIN_VALUE;

        for (int num : lista) {
            if (num > max1) {
                max3 = max2;
                max2 = max1;
                max1 = num;
            } else if (num > max2) {
                max3 = max2;
                max2 = num;
            } else if (num > max3) {
                max3 = num;
            }
        }

        System.out.println("Três maiores: " + Arrays.asList(max1, max2, max3));
    }
}