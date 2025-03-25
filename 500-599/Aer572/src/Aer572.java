import java.util.Locale;
import java.util.Scanner;

public class Aer572 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.UK);

        for (int i = sc.nextInt(); i > 0; i--) {
            int zeros = 0;
            boolean hasNine = false;

            for (int j = 0; j < 5; j++) {
                float f = sc.nextFloat();

                if (f == 0) {
                    zeros++;
                } else if (f >= 9) {
                    hasNine = true;
                }

            }

            System.out.println(zeros == 0 || hasNine ? "MEDIA" : "SUSPENSO DIRECTO");
        }
    }
}

/*
import java.util.Locale;
import java.util.Scanner;

public class Aer572 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.UK);
        Solution solution = new Solution();

        for (int i = sc.nextInt(); i > 0; i--) {
            float[] arr = new float[5];
            for (int j = 0; j < arr.length; j++) {
                arr[j] = sc.nextFloat();
            }

            System.out.println(solution.solve(arr) ? "MEDIA" : "SUSPENSO DIRECTO");
        }
    }
}

class Solution {
    public boolean solve(float[] arr) {
        int zeros = 0;

        for (float f : arr) {
            if (f == 0) {
                zeros++;
            } else if (f >= 9) {
                return true;
            }
        }

        return zeros == 0;
    }
}
 */