import java.util.Scanner;

public class Aer653 {

    public static void main(String[] args) {
        Solution solution = new Solution();
        Scanner sc = new Scanner(System.in);

        for (int i = sc.nextInt(); i != 0; i = sc.nextInt()) {
            int[] arr = new int[i];
            for (int j = 0; j < i; j++) {
                arr[j] = sc.nextInt();
            }
            System.out.println(solution.solve(arr));
        }
    }

}

class Solution {
    public String solve(int[] arr) {
        String ans = "";
        int prev = Integer.MAX_VALUE;

        for (int i = 0, j = 9; j < arr.length; i++, j++) {
            int sum = 0;
            for (int k = i; k <= j; k++) {
                sum += arr[k];
            }

            if (sum <= prev) {
                ans = String.format("%d-%d %d:%02d", i * 100, (j + 1) * 100, sum / 60, sum % 60);
                prev = sum;
            }
        }

        return ans;
    }
}
