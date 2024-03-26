import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {
            String number = sc.next();

            if (!isSubnormal(number)) {
                System.out.println("no subnormal");
            } else {
                System.out.println("subnormal");
            }
        }
    }

    public static boolean isSubnormal(String number) {
        if (number.length() % 10 != 0) {
            return false;
        }

        int[] digits = new int[10];
        for (int i = 0; i < number.length(); i++) {
            digits[number.charAt(i) - '0']++;
        }

        for (int i = 0; i < digits.length - 1; i++) {
            if (digits[i] != digits[i + 1]) {
                return false;
            }
        }

        return true;
    }
}
