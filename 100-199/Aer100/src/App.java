import java.util.Arrays;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for (int i = sc.nextInt(); i > 0; i--) {
            int number = sc.nextInt();
            String num = String.format("%04d", number);
            char[] chars = num.toCharArray();
            Arrays.sort(chars);
            num = new String(chars);

            int b1 = Integer.parseInt(new StringBuilder(num).reverse().toString());
            int b2 = Integer.parseInt(num);

            if (number == 6174) {
                System.out.println(0);
                continue;
            }

            if (b1 == b2) {
                System.out.println(8);
                continue;
            }

            int b3;
            int ans = 1;
            while ((b3 = b1 - b2) != 6174) {
                ans++;

                num = String.format("%04d", b3);
                chars = num.toCharArray();
                Arrays.sort(chars);
                num = new String(chars);

                b1 = Integer.parseInt(new StringBuilder(num).reverse().toString());
                b2 = Integer.parseInt(num);
            }
            System.out.println(ans);

        }
    }
}
