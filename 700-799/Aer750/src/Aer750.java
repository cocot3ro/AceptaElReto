import java.util.Scanner;

public class Aer750 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Solution solution = new Solution();

        int input;
        while ((input = sc.nextInt()) != 0) {
            System.out.println(solution.checksum(input));
        }
    }
}

class Solution {

    public int checksum(int i) {
        int[] ans = checksum(new int[]{i, 0});

        return ans[0] * 10 + ans[1];
    }

    private int[] checksum(int[] input) {
        if (input[0] < 10) {
            return input;
        }

        int mult = 1;

        while (input[0] != 0) {
            int digit = input[0] % 10;
            input[0] /= 10;

            if (digit == 0) {
                input[1]++;
            } else {
                mult *= digit;
            }
        }

        input[0] = mult;

        return checksum(input);
    }

}