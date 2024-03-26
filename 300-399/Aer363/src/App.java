import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for (int e = sc.nextInt(); e != 0; e = sc.nextInt()) {
            int caloriasTotal = 0;
            for (int n = sc.nextInt(); n > 0; n--) {
                caloriasTotal += sc.nextInt();
            }

            int entrenamientos = 0;
            while (caloriasTotal > 0) {
                caloriasTotal -= e;
                entrenamientos++;
            }

            System.out.println(entrenamientos);
        }
    }
}
