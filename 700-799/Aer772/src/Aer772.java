import java.util.Scanner;

public class Aer772 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Solution solution = new Solution();

        for (int y = sc.nextInt(), n = sc.nextInt(); y != 0 && n != 0; y = sc.nextInt(), n = sc.nextInt()) {
            int[] ans = solution.solve(y, n);

            System.out.printf("[%d .. %d]%n", ans[0], ans[1]);
        }
    }
}

class Solution {
    public int[] solve(int y, int n) {
        return new int[] { y + 74 * n, y + 79 * n };
    }
}