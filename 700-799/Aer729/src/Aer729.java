import java.util.*;

public class Aer729 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {
            Map<String, Set<Integer>> players = new TreeMap<>();
            for (int i = sc.nextInt(); i > 0; i--) {
                String nombre = sc.next();
                Set<Integer> carton = new HashSet<>();
                int next = sc.nextInt();
                while (next != 0) {
                    carton.add(next);
                    next = sc.nextInt();
                }

                players.put(nombre, carton);
            }

            int nums = sc.nextInt();

            StringBuilder sb = new StringBuilder();

            for (int i = 0; i < nums; i++) {
                int num = sc.nextInt();

                if (sb.length() != 0) continue;

                for (Map.Entry<String, Set<Integer>> entry : players.entrySet()) {

                    if (entry.getValue().size() > nums) continue;

                    entry.getValue().remove(num);

                    if (entry.getValue().isEmpty()) {
                        sb.append(entry.getKey())
                                .append(" ");
                    }
                }
            }

            System.out.println(sb.toString().trim());
        }
    }
}