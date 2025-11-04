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
            Map<Character, List<Float>> registros = new HashMap<>();

            registros.put('D', new ArrayList<Float>());
            registros.put('A', new ArrayList<Float>());
            registros.put('M', new ArrayList<Float>());
            registros.put('I', new ArrayList<Float>());
            registros.put('C', new ArrayList<Float>());

            while (true) {
                String[] input = sc.nextLine().split(" ");
                if (input[0].equals("N")) {
                    break;
                }

                char categoria = input[0].charAt(0);
                float valor = Float.parseFloat(input[1]);

                registros.get(categoria).add(valor);
            }

            String maxCat = "EMPATE";
            float maxMedia = 0;

            String minCat = "EMPATE";
            float minMedia = Float.MAX_VALUE;

            Map<Character, Float> medias = new HashMap<>();
            float mediaGlobal = 0;

            for (Map.Entry<Character, List<Float>> entry : registros.entrySet()) {
                float media = getMedia(entry.getValue());
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

    private static float getMedia(List<Float> list) {
        if (list.isEmpty()) return 0;

        float ans = 0;
        for (float l : list) {
            ans += l;
        }
        return ans / list.size();
    }
}
