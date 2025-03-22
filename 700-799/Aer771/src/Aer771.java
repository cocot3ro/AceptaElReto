import java.util.Scanner;

public class Aer771 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Solution solution = new Solution();

        for (int i = sc.nextInt(); i > 0; i--) {
            System.out.println(solution.solve(sc.nextInt()));
        }
    }
}

class Solution {

    public int solve(int n) {
        return n * 4;
    }

}
