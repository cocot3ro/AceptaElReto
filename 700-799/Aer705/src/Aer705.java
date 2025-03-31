import java.util.Scanner;

public class Aer705 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Solution solution = new Solution();

        for (int i = sc.nextInt(); i > 0; i--) {
            int[] arr = new int[sc.nextInt()];

            for (int j = 0; j < arr.length; j++) {
                arr[j] = sc.nextInt();
            }

            System.out.println(solution.solve(arr));
        }
    }
}

class Solution {
    public int solve(int[] arr) {
        int max = 0;

        for (int i = 0; i < arr.length - 1; i++) {
            int resta = arr[arr.length - 1 - i] - arr[arr.length - 2 - i];

            if (resta > max) {
                max = resta;
            } else if (resta == max) {
                max++;
            }
        }

        return Math.max(arr[0] == max ? arr[0] + 1 : arr[0], max);

    }
}
