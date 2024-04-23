import java.util.*;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Map<String, String> categorias = new HashMap<>();
        categorias.put("D", "DESAYUNOS");
        categorias.put("A", "COMIDAS");
        categorias.put("M", "MERIENDAS");
        categorias.put("I", "CENAS");
        categorias.put("C", "COPAS");
        categorias.put("EMPATE", "EMPATE");

        while (sc.hasNext()) {
            Map<Character, List<Double>> registros = new HashMap<>();

            registros.put('D', new ArrayList<Double>());
            registros.put('A', new ArrayList<Double>());
            registros.put('M', new ArrayList<Double>());
            registros.put('I', new ArrayList<Double>());
            registros.put('C', new ArrayList<Double>());

            while (true) {
                String[] input = sc.nextLine().split(" ");
                if (input[0].equals("N")) {
                    break;
                }

                char categoria = input[0].charAt(0);
                double valor = Double.parseDouble(input[1]);

                registros.get(categoria).add(valor);
            }

            String maxCat = "EMPATE";
            double maxMedia = 0;

            String minCat = "EMPATE";
            double minMedia = Double.MAX_VALUE;

            Map<Character, Double> medias = new HashMap<>();
            double mediaGlobal = 0;

            for (Map.Entry<Character, List<Double>> entry : registros.entrySet()) {
                double media = getMedia(entry.getValue());
                mediaGlobal += media;
                medias.put(entry.getKey(), media);

                if (media > maxMedia) {
                    maxCat = entry.getKey().toString();
                    maxMedia = media;
                } else if (media == maxMedia) {
                    maxCat = "EMPATE";
                }

                if (media < minMedia) {
                    minCat = entry.getKey().toString();
                    minMedia = media;
                } else if (media == minMedia) {
                    minCat = "EMPATE";
                }
            }

            mediaGlobal /= 5;

            System.out.println(categorias.get(maxCat) + "#" + categorias.get(minCat) + "#" + (medias.get('A') > mediaGlobal ? "SI" : "NO"));
        }
    }

    private static double getMedia(List<Double> list) {
        if (list.isEmpty()) return 0;

        double ans = 0;
        for (double d : list) {
            ans += d;
        }
        return ans / list.size();
    }
}
