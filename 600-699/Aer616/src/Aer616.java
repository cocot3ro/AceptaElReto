import java.util.Scanner;

public class Aer616 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Solution solution = new Solution();

        for (int i = sc.nextInt(); i != 0; i = sc.nextInt()) {
            String[] arr = new String[i];
            for (int j = 0; j < i; j++) {
                arr[j] = sc.next();
            }
            System.out.println(solution.solve(arr));
        }
    }

}

class Solution {

    private static final String PIC = "PIC";
    private static final String POC = "POC";

    public String solve(String[] arr) {
        int player1 = 0;
        int player2 = 0;

        int c = 0;

        for (String s : arr) {
            if (s.equals(POC)) continue;

            if (s.equals(PIC)) {
                c++;
            } else {
                if (c % 2 == 0) {
                    player1++;
                    c = 0;
                } else {
                    player2++;
                    c = 1;
                }
            }
        }

        return player1 + " " + player2;
    }

}