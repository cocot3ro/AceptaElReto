import java.util.Scanner;

public class Aer688 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNextInt()) {
            int c = sc.nextInt();
            int m = sc.nextInt();
            int n = sc.nextInt();

            int[] slopes = new int[n + 1];
            for (int i = 0; i < slopes.length; i++) {
                slopes[i] = sc.nextInt();
            }

            if (Solution.solve(c, m, slopes)) {
                System.out.println("Ok");
            } else {
                System.out.println("Tropiezo");
            }
        }
    }
}

class Solution {
    public static boolean solve(int c, int m, int[] slopes) {

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        int a = slopes[1] - slopes[0];

        if (a < min) min = a;
        if (a > max) max = a;

        for (int i = 1; i < slopes.length - 1; i++) {
            int b = slopes[i + 1] - slopes[i];

            if (Math.abs(a - b) > c) return false;

            if (b < min) min = b;
            if (b > max) max = b;

            a = b;
        }

        return max - min <= m;
    }
}