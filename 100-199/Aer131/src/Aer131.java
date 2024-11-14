import java.io.IOException;
import java.nio.file.Paths;
import java.util.Scanner;

public class Aer131 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        while (true) {
            double[] y = new double[3];
            double[] v = new double[3];

            y[0] = sc.nextDouble();
            y[1] = sc.nextDouble();
            y[2] = sc.nextDouble();

            v[0] = sc.nextDouble();
            v[1] = sc.nextDouble();
            v[2] = sc.nextDouble();

            if (y[0] == 0 || v[0] == 0) break;

            System.out.println(Solution.solve(y, v));
        }
    }
}

class Solution {

    private static final String EMPATE = "EMPATE";
    private static final String VECINO = "VECINO";
    private static final String YO = "YO";

    public static String solve(double[] y, double[] v) throws IOException {
        double y1 = y[1] - y[2];
        double v1 = v[1] - v[2];

        int yo, vecino;

        if (y[1] >= y[0]) yo = 1;
        else if (y1 <= 0d) yo = Integer.MAX_VALUE;
        else yo = (int) Math.ceil(y[0] / y1);

        if (v[1] >= v[0]) vecino = 1;
        else if (v1 <= 0d) vecino = Integer.MAX_VALUE;
        else vecino = (int) Math.ceil((v[0] / v1));

        if (yo == Integer.MAX_VALUE && vecino == Integer.MAX_VALUE) {
            new Scanner(Paths.get(""));
        }

        if (yo == vecino) return EMPATE + " " + yo;

        return yo < vecino ? YO + " " + yo : VECINO + " " + vecino;
    }
}
