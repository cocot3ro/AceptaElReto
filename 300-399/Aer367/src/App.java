import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for (int i = sc.nextInt(); i > 0; i--) {
            int start = sc.nextInt();
            List<Integer> list = new LinkedList<>();
            StringBuilder ans = new StringBuilder();

            for (int j = sc.nextInt(); j > 0; j--) {
                int n = sc.nextInt();
                if (start == n) {
                    ans.append(start);
                } else {
                    list.add(n);
                }
            }

            while (!list.isEmpty()) {
                int min = Integer.MAX_VALUE;
                int next = -1;
                for (int n : list) {
                    int diff = Math.abs(start - n);
                    if (diff < min) {
                        min = diff;
                        next = n;
                    } else if (diff == min) {
                        next = Math.max(next, n);
                    }
                }
                ans.append(" ").append(next);
                list.remove((Integer) (next));
                start = next;

            }
            System.out.println(ans.toString().trim());
        }
    }
}
