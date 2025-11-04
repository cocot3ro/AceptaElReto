import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {
            String palabra = sc.nextLine();
            System.out.println(letrasParaPalindromo(palabra));
        }
    }

    public static int letrasParaPalindromo(String palabra) {
        int n = palabra.length();
        int[][] dp = new int[n][n];

        // Llenar la tabla dp
        for (int len = 2; len <= n; len++) {
            for (int i = 0; i <= n - len; i++) {
                int j = i + len - 1;
                if (palabra.charAt(i) == palabra.charAt(j)) {
                    dp[i][j] = dp[i + 1][j - 1];
                } else {
                    dp[i][j] = Math.min(dp[i + 1][j], dp[i][j - 1]) + 1;
                }
            }
        }

        return dp[0][n - 1];
    }
}
