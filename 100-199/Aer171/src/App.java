import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for (int i; (i = sc.nextInt()) != 0; ) {
            int[] picos = new int[i];
            for (int j = 0; j < i; j++) {
                picos[j] = sc.nextInt();
            }

            int altura = Integer.MIN_VALUE;
            int ans = 0;
            for (int j = i - 1; j >= 0; j--) {
                if (picos[j] > altura) {
                    altura = picos[j];
                    ans++;
                }
            }

            System.out.println(ans);
        }
    }
}