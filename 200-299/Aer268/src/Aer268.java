import java.util.*;

public class Aer268 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for (int p = sc.nextInt(), c = sc.nextInt(); p != 0 || c != 0; p = sc.nextInt(), c = sc.nextInt()) {
            Integer[] platos = new Integer[p];
            for (int i = 0; i < platos.length; i++) {
                platos[i] = sc.nextInt();
            }

            Integer[] coronas = new Integer[c];
            for (int i = 0; i < coronas.length; i++) {
                coronas[i] = sc.nextInt();
            }

            Set<Pair> results = Solution.solve(platos, coronas);
            StringBuilder sb = new StringBuilder();
            for (Pair pair : results) {
                sb.append(pair).append(" ");
            }
            System.out.print(sb.toString().trim());
            System.out.println();
        }
    }
}

class Solution {
    public static Set<Pair> solve(Integer[] platos, Integer[] coronas) {
        Set<Pair> ans = new TreeSet<>();

        for (Integer plato : platos) {
            for (Integer corona : coronas) {
                ans.add(new Pair(plato, corona));
            }
        }

        return ans;
    }
}

class Pair implements Comparable<Pair> {
    private final int first;
    private final int second;

    Pair(int first, int second) {
        this.first = first;
        this.second = second;
    }

    float getRatio() {
        return (float) first / second;
    }

    @Override
    public int compareTo(Pair pair) {
        return Float.compare(this.getRatio(), pair.getRatio());
    }

    @Override
    public String toString() {
        return first + "-" + second;
    }
}