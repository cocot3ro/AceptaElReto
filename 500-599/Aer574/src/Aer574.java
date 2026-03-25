import java.util.ArrayList;
import java.util.Scanner;

public class Aer574 {

    static Scanner in;
    static ArrayList<Long> levelSizes = new ArrayList<>();

    public static boolean casoDePrueba() {

        if (!in.hasNext()) return false;

        // CÓDIGO PRINCIPAL AQUÍ (incluyendo
        // la lectura del caso de prueba)
        // Procesa un único caso leyendo con
        // in.next*()

        int n = in.nextInt();
        long k = in.nextLong() - 1;

        computeLevelSizes(n);

        System.out.println(recursive(n, k));

        return true;
    } // casoDePrueba

    static void computeLevelSizes(int n) {
        if (levelSizes.isEmpty())
            //noinspection SequencedCollectionMethodCanBeUsed
            levelSizes.add(0, 3L);

        for (int i = levelSizes.size(); i < n; i++) {
            levelSizes.add(i, levelSizes.get(i - 1) * 2 + 3 + i);
        }
    }

    static char recursive(int n, long k) {
        if (n == 1) {
            if (k == 0L) {
                return 'B';
            } else if (k == 1L) {
                return 'U';
            } else {
                return 'H';
            }
        }

        long prevLevelSize = levelSizes.get(Math.max(n - 2, 0));

        if (prevLevelSize <= k && k < prevLevelSize + 2 + n) {
            if (k == prevLevelSize) {
                return 'B';
            } else if (k == prevLevelSize + 1 + n) {
                return 'H';
            } else {
                return 'U';
            }
        } else {
            if (k > prevLevelSize) {
                k = k - prevLevelSize - 2 - n;
            }
            return recursive(n - 1, k);
        }
    }

    public static void main(String[] args) {

        in = new Scanner(System.in);

        while (casoDePrueba()) ;

    } // main

} // class Solution
