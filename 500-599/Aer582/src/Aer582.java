import java.util.Scanner;

public class Aer582 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Solution solution = new Solution();

        for (int i = Integer.parseInt(sc.nextLine()); i > 0; i--) {
            System.out.println(solution.solve(sc.nextLine()));
        }

    }
}

class Solution {
    private static final String SALIDA_NULA = "SALIDA NULA";
    private static final String MARISA_NARANJO = "MARISA NARANJO";
    private static final String CORRECTO = "CORRECTO";
    private static final String TARDE = "TARDE";
    private static final String DING_DONG = "ding-dong";

    public String solve(String s) {
        if (s.isEmpty()) {
            return MARISA_NARANJO;
        }

        String[] parts = s.split(" ");

        if (parts[0].equals(DING_DONG)) {
            return SALIDA_NULA;
        }

        if (parts.length == 12) {
            return CORRECTO;
        }

        return TARDE;
    }
}