import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for (int votos = sc.nextInt(); votos != 0; votos = sc.nextInt()) {
            Map<String, Integer> map = new HashMap<>();

            for (int i = 0; i < votos; i++) {
                String voto = sc.next();
                if (map.containsKey(voto)) {
                    map.put(voto, map.get(voto) + 1);
                } else {
                    map.put(voto, 1);
                }
            }

            int max = -1;
            String winner = "";

            for (Map.Entry<String, Integer> entry : map.entrySet()) {
                if (entry.getValue() > max) {
                    max = entry.getValue();
                    winner = entry.getKey();
                } else if (entry.getValue() == max) {
                    winner = "EMPATE";
                }
            }

            System.out.println(winner);
        }
    }
}
