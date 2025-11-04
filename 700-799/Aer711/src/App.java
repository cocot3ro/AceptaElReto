import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for (int i = sc.nextInt(); i > 0; i--) {
            long l = sc.nextLong();
            System.out.println(new Solution().solve(l));
        }
    }
}

class Solution {
    private byte[] dp;
    private byte[] bytes;

    public long solve(long l) {
        bytes = getBytes(l);
        dp = new byte[bytes.length];

        minor();
        major();

        long ans = 0;

        for (int i = 0; i < dp.length; i++) {
            ans += bytes[i] * (3 - i % 2) + dp[i];
        }

        return ans;
    }

    private byte[] getBytes(long l) {
        byte[] bytes = new byte[(l + "").length()];

        for (int i = bytes.length - 1; i >= 0; i--) {
            bytes[i] = (byte) (l % 10);
            l /= 10;
        }

        return bytes;
    }

    private void minor() {
        dp[dp.length - 2] = bytes[bytes.length - 1];

        for (int i = dp.length - 4; i > -1; i -= 2) {
            dp[i] = (byte) Math.min(Math.min(bytes[i + 1], bytes[i + 2]), dp[i + 2]);
        }
    }

    private void major() {
        dp[1] = bytes[0];

        for (int i = 3; i < dp.length; i += 2) {
            dp[i] = (byte) Math.max(Math.max(bytes[i - 1], bytes[i - 2]), dp[i - 2]);
        }
    }
}
