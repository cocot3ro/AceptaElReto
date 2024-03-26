import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for (int i = sc.nextInt(); i != 0; i = sc.nextInt()) {
            while (i > 0) {
                if (i >= 1_000_000) {
                    System.out.print("H");
                    i -= 1_000_000;
                } else if (i >= 100_000) {
                    System.out.print("R");
                    i -= 100_000;
                } else if (i >= 10_000) {
                    System.out.print("D");
                    i -= 10_000;
                } else if (i >= 1000) {
                    System.out.print("F");
                    i -= 1_000;
                } else if (i >= 100) {
                    System.out.print("C");
                    i -= 100;
                } else if (i >= 10) {
                    System.out.print("G");
                    i -= 10;
                } else {
                    System.out.print("T");
                    i--;
                }
            }
            System.out.println();
        }
    }
}
