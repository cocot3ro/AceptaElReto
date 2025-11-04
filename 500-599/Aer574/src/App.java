import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {
            long n = sc.nextLong();
            long k = sc.nextLong() - 1;

            Solution solution = new Solution();

            System.out.println(solution.solve(n, k));
        }
    }
}

class Solution {
    private long[] levelSizes;

    public char solve(long n, long k) {
        computeLevelSizes(n);

        return recursive(n, k);
    }

    private void computeLevelSizes(long n) {
        levelSizes = new long[(int) n];
        levelSizes[0] = 3;

        for (int i = 1; i < levelSizes.length; i++) {
            levelSizes[i] = levelSizes[i - 1] * 2 + 3 + i;
        }
    }

    private char recursive(long n, long k) {
        if (n == 1) {
            if (k == 0L) {
                return 'B';
            } else if (k == 1L) {
                return 'U';
            } else {
                return 'H';
            }
        }

        long prevLevelSize = levelSizes[Math.max((int) n - 2, 0)];

        if (prevLevelSize <= k && k < prevLevelSize + 2 + n) {
            if (k == prevLevelSize) {
                return 'B';
            } else if (k == prevLevelSize + 1 + n) {
                return 'H';
            } else {
                return 'U';
            }
        } else {
            if (k > prevLevelSize) {
                k = k - prevLevelSize - 2 - n;
            }
            return recursive(n - 1, k);
        }
    }
}