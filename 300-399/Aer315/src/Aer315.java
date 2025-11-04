import java.util.Arrays;
import java.util.Scanner;

import static java.lang.Math.max;
import static java.lang.Math.min;

public class Aer315 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {

            int f = sc.nextInt();
            int c = sc.nextInt();

            char[][] board = new char[f][c];

            for (int i = 0; i < f; i++) {
                board[i] = sc.next().toCharArray();
            }

            int[][] inputs = new int[sc.nextInt()][];

            for (int i = 0; i < inputs.length; i++) {
                inputs[i] = new int[]{sc.nextInt() - 1, sc.nextInt() - 1};
            }

            char[][] ans = Solution.solve(board, inputs);

            if (ans == null) {
                System.out.println("GAME OVER");
                return;
            }

            for (char[] line : ans) {
                for (char ch : line) {
                    System.out.print(ch);
                }
                System.out.println();
            }
        }
    }
}

class Solution {

    static char[][] solve(char[][] board, int[][] inputs) {

        for (int[] input : inputs) {
            if (board[input[0]][input[1]] == '*') {
                return null;
            }
        }

        char[][] ans = new char[board.length][board[0].length];
        for (char[] an : ans) {
            Arrays.fill(an, 'X');
        }

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (board[i][j] == '*') {
                    for (int k = max(i - 1, 0); k < min(i + 2, board.length); k++) {
                        for (int l = max(j - 1, 0); l < min(j + 2, board[0].length); l++) {
                            if (board[k][l] == '*') continue;

                            if (board[k][l] == '-') {
                                board[k][l] = '1';
                            } else {
                                board[k][l] = (char) (board[k][l] + 1);
                            }
                        }
                    }
                }
            }
        }

        for (int[] input : inputs) {
            int i = input[0];
            int j = input[1];

            reveal(board, ans, i, j);
        }

        return ans;
    }

    private static void reveal(char[][] board, char[][] ans, int i, int j) {

        if (ans[i][j] != 'X') return;

        int mines = 0;

        if (board[i][j] != '-') {
            mines = board[i][j] - '0';
        }

        if (mines == 0) {
            ans[i][j] = '-';
            for (int k = max(i - 1, 0); k < min(i + 2, board.length); k++) {
                for (int l = max(j - 1, 0); l < min(j + 2, board[0].length); l++) {
                    if (k == i && l == j) continue;

                    reveal(board, ans, k, l);
                }
            }
        } else {
            ans[i][j] = (char) (mines + '0');
        }

    }
}
