import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Solution solution = new Solution();
        Scanner sc = new Scanner(System.in);

        for (int i = Integer.parseInt(sc.nextLine()); i > 0; i--) {
            System.out.println(solution.solve(sc.nextLine()));
        }

        sc.close();
    }

}

class Solution {

    public String solve(String horaEspejo) {
        String[] partes = horaEspejo.split(":");

        int h = Integer.parseInt(partes[0]);
        int m = Integer.parseInt(partes[1]);

        int hh = 12 - h - 1;
        int mm = (60 - m) % 60;

        if (m >= 30) {
            hh++;
        }

        hh = Math.min(12, Math.max(hh, 0));

        if (hh == 0) {
            hh = 12;
        }

        return String.format("%02d:%02d", hh, mm);
    }
}