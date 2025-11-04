import java.util.Scanner;

public class Aer754 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {
            System.out.println(solution.solve(sc.next()));
        }
    }
}

class Solution {

    public String solve(String s) {
        int[] counts = new int[26];

        int oddCount = 0;
        for (char c : s.toCharArray()) {
            oddCount -= 1 - (++counts[c - 'a'] % 2) * 2;
        }

        if (oddCount > 1 || (s.length() % 2 == 0 && oddCount == 1)) {
            return "NO HAY";
        }

        char[] chars = new char[s.length()];

        int idx = 0;
        for (int count = 0; count < counts.length; count++) {
            char c = (char) ('a' + count);

            if (counts[count] % 2 == 1) {
                chars[chars.length / 2] = c;
            }

            int i;
            for (i = 0; i < counts[count] / 2; i++) {
                chars[idx + i] = c;
                chars[chars.length - 1 - idx - i] = c;
            }
            idx += i;

        }

        return new String(chars);
    }
}
