import java.util.Scanner;

public class Aer751 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for (int i = sc.nextInt(); i > 0; i--) {
            System.out.println(Solution.solve(sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt()));
        }
    }
}

class Solution {
    public static int solve(int a, int b, int c, int d) {
        int ans = Math.min(b, d) - Math.max(a, c) + 1;

        return Math.max(ans, 0);
    }
}
