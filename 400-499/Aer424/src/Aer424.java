import java.util.Scanner;

public class Aer424 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for (int i = sc.nextInt(); i != 0; i = sc.nextInt()) {
            int amount = 0;
            int max = 0;

            for (int j = 0; j < i; j++) {
                amount += sc.nextInt();
                max = Math.max(max, amount);
            }

            System.out.println(amount + " " + max);
        }
    }
}
