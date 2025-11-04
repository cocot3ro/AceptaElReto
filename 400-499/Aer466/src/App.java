import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Solution solution = new Solution();
        Scanner scanner = new Scanner(System.in);

        for (int i = scanner.nextInt(); i > 0; i--) {
            String n1 = scanner.next();
            String n2 = scanner.next();
            System.out.println(solution.solve(n1, n2));
        }
    }
}

class Solution {
    public String solve(String n1, String n2) {
        StringBuilder sb = new StringBuilder();
        int carry = 0;
        
        char[] n1Arr = new char[Math.max(n1.length(), n2.length())];
        char[] n2Arr = new char[n1Arr.length];
        
        System.arraycopy(n1.toCharArray(), 0, n1Arr, n1Arr.length - n1.length(), n1.length());
        System.arraycopy(n2.toCharArray(), 0, n2Arr, n2Arr.length - n2.length(), n2.length());

        Arrays.fill(n1Arr, 0, n1Arr.length - n1.length(), '0');
        Arrays.fill(n2Arr, 0, n2Arr.length - n2.length(), '0');
        
        for (int i = n1Arr.length - 1; i >= 0; i--) {
            int m = (n1Arr[i] - '0') * (n2Arr[i] - '0') + carry;
            carry = m / 10;
            sb.insert(0, m % 10);
        }
        
        if (carry > 0) {
            sb.insert(0, carry);
        }
        
        return sb.toString();
    }
}