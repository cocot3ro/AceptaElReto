import java.util.Scanner;

public class Aer188 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            if (Solution.solve(sc.nextLine().split(" "))) {
                System.out.println("SI");
            } else {
                System.out.println("NO");
            }
        }
    }
}

class Solution {
    public static boolean solve(String[] s) {
        for (int i = 1; i < s.length; i++) {
            int prevLength = s[i - 1].length();
            String prev = s[i - 1].substring(prevLength - 2, prevLength);
            String curr = s[i].substring(0, 2);

            if (!prev.equals(curr)) return false;
        }

        return true;
    }
}
