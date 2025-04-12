public class Ex53 {
    public static boolean ehSimetrica(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++)
            for (int j = 0; j < matriz[i].length; j++)
                if (matriz[i][j] != matriz[j][i]) return false;
        return true;
    }

    public static void main(String[] args) {
        int[][] matriz = {{1, 2, 3}, {2, 4, 5}, {3, 5, 6}};
        System.out.println("Matriz é simétrica? " + ehSimetrica(matriz));
    }
}