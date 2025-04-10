import java.util.Scanner;

public class Aer103 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for (int g = sc.nextInt(); g < 20; g = sc.nextInt()) {
            int[] c = new int[g + 1];
            for (int i = 0; i < c.length; i++) {
                c[i] = sc.nextInt();
            }

            int n = sc.nextInt();

            float ans = Solution.solve(c, n);

            if (Math.abs((1 - ans) - ans) > 0.001f) {
                if (1 - ans > ans) {
                    System.out.println("ABEL");
                } else {
                    System.out.println("CAIN");
                }
            } else {
                System.out.println("JUSTO");
            }
        }
    }
}

class Solution {

    public static float solve(int[] c, int n) {

        float sum = 0;

        for (float i = 0; i < n; i++) {
            float x = i / n;

            float f = f(c, x);
            if (f <= 0) continue;

            sum += (Math.min(f, 1) / n);
        }

        return sum;
    }

    private static float f(int[] c, float x) {
        float sum = 0;
        for (int i = 0; i < c.length; i++) {
            sum += (float) (c[i] * Math.pow(x, c.length - 1 - i));
        }
        return sum;
    }

}
