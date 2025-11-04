import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for (int i = sc.nextInt(); i > 0; i--) {
            int[][] matrix = new int[sc.nextInt()][sc.nextInt()];
            for (int j = sc.nextInt(); j > 0; j--) {
                spiralMatrix(matrix, sc.nextInt() - 1, sc.nextInt() - 1, sc.next().charAt(0), sc.nextInt());
            }

            for (int[] row : matrix) {
                for (int k = 0; k < row.length; k++) {
                    System.out.print(row[k]);
                    if (k != row.length - 1) {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
            System.out.println("---");
        }
    }

    private static void spiralMatrix(int[][] matrix, int rStart, int cStart, char direction, int maxSteps) {
        int currRow = rStart;
        int currCol = cStart;

        int steps = 0;

        int timesRight, timesBot, timesLeft, timesTop;

        switch (direction) {
            case 'E':
                timesRight = 1;
                timesBot = 1;
                timesLeft = 2;
                timesTop = 2;
                break;
            case 'S':
                timesRight = 2;
                timesBot = 1;
                timesLeft = 1;
                timesTop = 2;
                break;
            case 'W':
                timesRight = 2;
                timesBot = 2;
                timesLeft = 1;
                timesTop = 1;
                break;
            case 'N':
                timesRight = 1;
                timesBot = 2;
                timesLeft = 2;
                timesTop = 1;
                break;
            default:
                timesRight = timesBot = timesLeft = timesTop = 0;
                break;
        }

        loop:
        while (steps <= maxSteps) {
            if (direction == 'E') {
                for (int j = 0; j < timesRight; j++) {
                    if (outTheMatrix(matrix.length, currRow, matrix[0].length, currCol) || steps > maxSteps) {
                        break loop;
                    }
                    matrix[currRow][currCol]++;
                    currCol++;
                    steps++;
                }
                timesRight += 2;
                direction = 'S';
            }

            if (direction == 'S') {
                for (int j = 0; j < timesBot; j++) {
                    if (outTheMatrix(matrix.length, currRow, matrix[0].length, currCol) || steps > maxSteps) {
                        break loop;
                    }
                    matrix[currRow][currCol]++;
                    currRow++;
                    steps++;
                }
                timesBot += 2;
                direction = 'W';
            }

            if (direction == 'W') {
                for (int j = 0; j < timesLeft; j++) {
                    if (outTheMatrix(matrix.length, currRow, matrix[0].length, currCol) || steps > maxSteps) {
                        break loop;
                    }
                    matrix[currRow][currCol]++;
                    currCol--;
                    steps++;
                }
                timesLeft += 2;
                direction = 'N';
            }

            if (direction == 'N') {
                for (int j = 0; j < timesTop; j++) {
                    if (outTheMatrix(matrix.length, currRow, matrix[0].length, currCol) || steps > maxSteps) {
                        break loop;
                    }
                    matrix[currRow][currCol]++;
                    currRow--;
                    steps++;
                }
                timesTop += 2;
                direction = 'E';
            }
        }
    }

    private static boolean outTheMatrix(int rows, int currRow, int cols, int currCol) {
        return !(currRow >= 0 && currRow < rows && currCol >= 0 && currCol < cols);
    }
}
