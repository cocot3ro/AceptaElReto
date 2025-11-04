import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;
import java.util.HashMap;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        Map<Integer, Integer> map = new HashMap<>();
        for (int cantidad = sc.nextInt(); cantidad != 0; cantidad = sc.nextInt(), map = new HashMap<>()) {
            for (int i = 0; i < cantidad; i++) {
                Integer clave = sc.nextInt();
                map.put(clave, (map.containsKey(clave) ? map.get(clave) + 1 : 1));
            }

            int valorMax = -1;
            int claveMax = -1;

            Set<Entry<Integer, Integer>> entrySet = map.entrySet();
            for (Entry<Integer, Integer> entry : entrySet) {
                if (entry.getValue() > valorMax) {
                    valorMax = entry.getValue();
                    claveMax = entry.getKey();
                }
            }

            System.out.println(claveMax);
        }

        sc.close();
    }
}
