import java.util.Scanner;

public class Aer612 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {
            long r = sc.nextLong();
            long x = sc.nextLong();
            long y = sc.nextLong();

            System.out.println(Solution.solve(r, x, y));
        }
    }
}

class Solution {
    public static long solve(long r, long x, long y) {
        return solve(r, x, y, 0, 0);
    }

    private static long solve(long r, long x, long y, long cx, long cy) {
        if (r < 1) return 0;

        long rHalf = r / 2;

        long distanceToCenter = (long) (Math.pow(x - cx, 2) + Math.pow(y - cy, 2));

        long lastDistance = (long) (Math.pow(x - cx, 2) + Math.pow(y - (cy + r), 2));
        long nextCx = cx;
        long nextCy = cy + r;

        long nextDistance = (long) (Math.pow(x - (cx + r), 2) + Math.pow(y - cy, 2));
        if (nextDistance < lastDistance) {
            lastDistance = nextDistance;
            nextCx = cx + r;
            nextCy = cy;
        }

        nextDistance = (long) (Math.pow(x - cx, 2) + Math.pow(y - (cy - r), 2));
        if (nextDistance < lastDistance) {
            lastDistance = nextDistance;
            nextCx = cx;
            nextCy = cy - r;
        }

        nextDistance = (long) (Math.pow(x - (cx - r), 2) + Math.pow(y - cy, 2));
        if (nextDistance < lastDistance) {
            nextCx = cx - r;
            nextCy = cy;
        }

        return ((distanceToCenter > r * r) ? 0 : 1) + solve(
                /*r*/ rHalf,
                /*x*/ x,
                /*y*/ y,
                /*cx*/ nextCx,
                /*cy*/ nextCy
        );
    }
}
