import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        for (String categoria = sc.nextLine(); !categoria.equals("FIN"); categoria = sc.nextLine()) {
            Map<String, Integer> map = new HashMap<>();
            int partidosJugados = 0;

            for (String entrada = sc.nextLine(); !entrada.equals("FIN"); entrada = sc.nextLine()) {
                String[] partes = entrada.split(" ");

                String eq1 = partes[0];
                Integer ptsEq1 = Integer.valueOf(partes[1]);
                Integer ptsTotalEq1 = map.get(eq1);

                String eq2 = partes[2];
                Integer ptsEq2 = Integer.valueOf(partes[3]);
                Integer ptsTotalEq2 = map.get(eq2);

                map.put(eq1, (ptsTotalEq1 == null ? 0 : ptsTotalEq1) + (ptsEq1 > ptsEq2 ? 2 : 1));
                map.put(eq2, (ptsTotalEq2 == null ? 0 : ptsTotalEq2) + (ptsEq2 > ptsEq1 ? 2 : 1));
                partidosJugados++;
            }

            int max = 0;
            String ganador = "";

            Set<Entry<String, Integer>> entrySet = map.entrySet();
            for (Entry<String, Integer> entry : entrySet) {
                if (entry.getValue() > max) {
                    max = entry.getValue();
                    ganador = entry.getKey();
                } else if (entry.getValue() == max)
                    ganador = "EMPATE";
            }

            int partidosSinJugar = map.size() * (map.size() - 1) - partidosJugados;
            System.out.println(ganador + " " + partidosSinJugar);
        }
        sc.close();
    }
}
