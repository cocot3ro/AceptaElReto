import java.util.Scanner;

public class Aer101 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for (int n = sc.nextInt(); n != 0; n = sc.nextInt()) {
            int[][] matrix = new int[n][n];

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    matrix[i][j] = sc.nextInt();
                }
            }

            boolean esDiabolico = esDiabolico(matrix);

            if (!esDiabolico) {
                System.out.println("NO");
                continue;
            }

            boolean esEsoterico = esEsoterico(matrix);

            if (esEsoterico) {
                System.out.println("ESOTERICO");
            } else {
                System.out.println("DIABOLICO");
            }
        }
    }

    private static int getCM(int[][] matrix) {
        int sum = 0;
        for (int i : matrix[0]) {
            sum += i;
        }
        return sum;
    }

    private static boolean esDiabolico(int[][] matrix) {
        int n = matrix.length;
        final int CM = getCM(matrix);

        for (int i = 0; i < n; i++) {
            int rowSum = 0;
            int colSum = 0;
            for (int j = 0; j < n; j++) {
                rowSum += matrix[i][j];
                colSum += matrix[j][i];
            }

            if (rowSum != CM || colSum != CM) {
                return false;
            }
        }

        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += matrix[i][i];
        }

        if (sum != CM) {
            return false;
        }

        sum = 0;
        for (int i = 0; i < n; i++) {
            sum += matrix[i][n - i - 1];
        }

        return sum == CM;
    }

    private static boolean esEsoterico(int[][] matrix) {
        int sum = 0;
        for (int[] row : matrix) {
            for (int i : row) {
                sum += i;
            }
        }

        int n = matrix.length;

        int s = ((n * n) * ((n * n) + 1)) / 2;

        if (sum != s) {
            return false;
        }

        final int CM = getCM(matrix);
        final int CM2 = 4 * CM / n;

        int esquinas = matrix[0][0] + matrix[0][n - 1] + matrix[n - 1][0] + matrix[n - 1][n - 1];

        if (esquinas != CM2) {
            return false;
        }

        if (n % 2 == 0) {
            int bordes = matrix[0][n / 2 - 1] + matrix[0][n / 2] +
                    matrix[n / 2 - 1][0] + matrix[n / 2][n - 1] +
                    matrix[n / 2][0] + matrix[n / 2 - 1][n - 1] +
                    matrix[n - 1][n / 2 - 1] + matrix[n - 1][n / 2];
            if (bordes != 2 * CM2) {
                return false;
            }

            int centro = matrix[n / 2 - 1][n / 2 - 1] + matrix[n / 2 - 1][n / 2] +
                    matrix[n / 2][n / 2 - 1] + matrix[n / 2][n / 2];

            return centro == CM2;
        } else {
            int bordes = matrix[0][n / 2] +
                    matrix[n / 2][0] +
                    matrix[n / 2][n - 1] +
                    matrix[n - 1][n / 2];
            if (bordes != CM2) {
                return false;
            }

            return 4 * matrix[n / 2][n / 2] == CM2;
        }
    }

}
