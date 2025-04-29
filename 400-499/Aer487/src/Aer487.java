import java.util.Scanner;

public class Aer487 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for (int i = sc.nextInt(); i > 0; i--) {
            long n = sc.nextLong();
            System.out.println(Solution.solve(n));
        }
    }
}

class Solution {
    public static long solve(long n) {
        if (n < 3600) return (int) n;

        long sum = 3600 + (n / 3600) + (n % 3600);

        return sum + (sum % 3600 == 0 ? 1 : 0);
    }
}
