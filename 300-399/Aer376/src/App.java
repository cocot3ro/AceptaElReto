import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for (int n; (n = sc.nextInt()) != 0; ) {
            int[] arr = new int[n];

            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            int ans = 0;
            for (int i = 1; i < n; i++) {
                if (arr[i] > arr[(i - 1) % n] && arr[i] > arr[(i + 1) % n]) {
                    ans++;
                }
            }

            if (arr[0] > arr[1] && arr[0] > arr[n - 1]) {
                ans++;
            }

            System.out.println(ans);
        }
    }
}
