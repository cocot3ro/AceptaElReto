import java.util.*;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for (int equipos = sc.nextInt(), globos = sc.nextInt(); !(equipos == 0 && globos == 0); equipos = sc.nextInt(), globos = sc.nextInt()) {
            if (globos == 0) {
                System.out.println(equipos > 1 ? "EMPATE" : 1);
                continue;
            }

            HashMap<Integer, Integer> map = new HashMap<>();
            for (int i = 0; i < globos; i++) {
                int equipo = sc.nextInt();
                sc.next();
                map.put(equipo, (map.get(equipo) == null ? 1 : map.get(equipo) + 1));
            }

            int max = Integer.MIN_VALUE;
            int ganador = -1;

            for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
                if (entry.getValue() > max) {
                    max = entry.getValue();
                    ganador = entry.getKey();
                } else if (entry.getValue() == max) {
                    ganador = -1;
                }
            }
            System.out.println(ganador == -1 ? "EMPATE" : ganador);
        }
    }
}
