import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {
            int[] arr = new int[1_000_000_000];

            int last = -1;
            int end = 0;
            for (int i = sc.nextInt(); i > 0; i--) {
                int start = sc.nextInt() - 1;
                end = sc.nextInt();
                last = Math.max(last, end);
                for (int j = start; j < end - 1; j++) {
                    arr[j]++;
                }
            }

            int max = 0;
            for (int i = 0; i < end; i++) {
                max = Math.max(max, arr[i]);
            }

            System.out.println(max - 1);
        }
    }
}
