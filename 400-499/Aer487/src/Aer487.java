import java.util.Scanner;

public class Aer487 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for (int i = sc.nextInt(); i > 0; i--) {
            long n = sc.nextLong();
            long start = System.currentTimeMillis();
            long ans = Solution.solve(n);
            long end = System.currentTimeMillis();
            System.out.println(ans);
            System.out.println("Time taken: " + (end - start) + "ms");
        }
    }
}

class Solution {
    public static long solve(long n) {
        long div = n / 3600;

        long ans = 3600 * div;
        n -= (div * 3600);
        n += div;

        while (n >= 3600) {
            n -= 3599;
            ans += 3600;
        }

        return ans + n;
    }
}
