import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Solution solution = new Solution();
        Scanner sc = new Scanner(System.in);

        for (int i = sc.nextInt(); i > 0; i--) {
            int n = sc.nextInt();
            System.out.println(solution.solve(n) ? "SI" : "NO");
        }
    }

}

class Solution {
    public boolean solve(int n) {
        int i = 0;

        for (char c : base5(n).toCharArray()) {
            if (c == '4') {
                i++;
            }
        }

        return i > 1;
    }

    private String base5(int n) {
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            sb.append(n % 5);
            n /= 5;
        }
        return sb.reverse().toString();
    }
}