import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Aer665 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for (int i = sc.nextInt(); i > 0; i--) {
            String v1 = sc.next();
            String v2 = sc.next();

            if (Solution.solve(v1, v2)) {
                System.out.println("SI");
            } else {
                System.out.println("NO");
            }
        }
    }
}

class Solution {
    public static boolean solve(String v1, String v2) {
        String[] sv1 = v1.split("\\.");
        String[] sv2 = v2.split("\\.");

        int[] iv1 = new int[]{
                Integer.parseInt(sv1[0]),
                Integer.parseInt(sv1[1]),
                Integer.parseInt(sv1[2])
        };
        int[] iv2 = new int[]{
                Integer.parseInt(sv2[0]),
                Integer.parseInt(sv2[1]),
                Integer.parseInt(sv2[2])
        };

        List<int[]> nextVersions = getNextVersions(iv1);

        for (int[] nextVersion : nextVersions) {
            if (Arrays.equals(iv2, nextVersion)) {
                return true;
            }
        }

        return false;
    }

    private static List<int[]> getNextVersions(int[] v) {
        List<int[]> res = new ArrayList<>(3);

        res.add(new int[]{
                v[0],
                v[1],
                v[2] + 1
        });

        res.add(new int[]{
                v[0],
                v[1] + 1,
                0
        });

        res.add(new int[]{
                v[0] + 1,
                0,
                0
        });

        return res;
    }
}
