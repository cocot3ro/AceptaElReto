import java.util.Arrays;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int length;
        while ((length = sc.nextInt()) != 0) {
            int[] arr = new int[length];
            for (int i = 0; i < length; i++) {
                arr[i] = sc.nextInt();
            }

            boolean b = false;
            for (int i = length - 1; i > 0; i--) {
                if (Math.abs((arr[i] + 1) - arr[i - 1]) <= 1) {
                    arr[i]++;
                    b = true;
                    break;
                }
            }

            if (!b) {
                Arrays.fill(arr, 0, length, arr[0] + 1);
            }

            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < length; i++) {
                sb.append(arr[i]);
                if (i < length - 1) {
                    sb.append(" ");
                }
            }

            System.out.println(sb);
        }
    }
}
