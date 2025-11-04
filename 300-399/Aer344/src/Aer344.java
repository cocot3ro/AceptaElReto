import java.util.Scanner;

public class Aer344 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Solution solution = new Solution();

        for (int i = sc.nextInt(); i > 0; i--) {
            String[] arr = new String[sc.nextInt()];

            for (int j = 0; j < arr.length; j++) {
                arr[j] = sc.next();
            }

            System.out.println(solution.solve(arr) ? "POSIBLE" : "IMPOSIBLE");
        }

    }
}

class Solution {

    public boolean solve(String[] arr) {
        int contH = 0;
        int contM = 0;

        for (String s : arr) {
            for (char c : s.toCharArray()) {
                if (c == 'H') {
                    contH++;
                } else if (c == 'M') {
                    contM++;
                }
            }
        }

        return contM == contH;
    }

}
