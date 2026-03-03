import java.util.*;

public class Aer291 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for (int i; (i = Integer.parseInt(sc.nextLine())) != 0; ) {

            List<String> lineas = new ArrayList<>(i);

            for (int j = 0; j < i; j++) {
                lineas.add(sc.nextLine());
            }

            Map<String, Set<Integer>> result = Solution.solve(lineas);
            for (Map.Entry<String, Set<Integer>> entry : result.entrySet()) {
                System.out.println(normalize(entry));
            }

            System.out.println("----");
        }
    }

    private static String normalize(Map.Entry<String, Set<Integer>> result) {
        return result.getKey() + " " + normalize(result.getValue());
    }

    private static String normalize(Set<Integer> set) {
        StringBuilder sb = new StringBuilder();

        for (Integer i : set) {
            sb.append(i).append(" ");
        }

        sb.deleteCharAt(sb.length() - 1);

        return sb.toString();
    }
}

class Solution {
    public static Map<String, Set<Integer>> solve(List<String> lineas) {
        Map<String, Set<Integer>> result = new TreeMap<>();
        for (int i = 0; i < lineas.size(); i++) {
            for (String palabra : lineas.get(i).split(" ")) {
                if (palabra.length() > 2) {
                    String palabraNormalizada = palabra.toLowerCase();

                    if (!result.containsKey(palabraNormalizada)) {
                        //noinspection Convert2Diamond
                        result.put(palabraNormalizada, new TreeSet<Integer>());
                    }
                    result.get(palabraNormalizada).add(i + 1);
                }
            }
        }

        return result;
    }
}
