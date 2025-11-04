import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNextInt()) {
            int n = sc.nextInt();
            int k = sc.nextInt();

            int[] valores = new int[n];
            for (int i = 0; i < n; i++) {
                valores[i] = sc.nextInt();
            }

            int max = Integer.MIN_VALUE;
            for (int i = 0; i < n - k + 1; i++) {
                int currA = 0;
                int currB = 0;
                for (int j = 0; j < k - 1; j++) {
                    currA += (valores[j + i + 1] - valores[j + i]);
                    currB += (valores[n - 2 - j - i] - valores[n - 1 - j - i]);
                }
                max = Math.max(max, Math.max(currA, currB));
            }

            System.out.println(max);
        }

        sc.close();
    }
}
