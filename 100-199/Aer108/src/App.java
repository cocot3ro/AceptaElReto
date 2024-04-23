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

            Map<Character, Double> medias = new HashMap<>();
            for (Map.Entry<Character, List<Double>> entry : registros.entrySet()) {
                medias.put(entry.getKey(), getMedia(entry.getValue()));
            }

            String maxCat = "EMPATE";
            double maxMedia = 0;
            for (Map.Entry<Character, Double> entry : medias.entrySet()) {
                if (entry.getValue() > maxMedia) {
                    maxMedia = entry.getValue();
                    maxCat = entry.getKey().toString();
                } else if (entry.getValue() == maxMedia) {
                    maxCat = "EMPATE";
                }
            }

            String minCat = "EMPATE";
            double minMedia = Double.MAX_VALUE;
            for (Map.Entry<Character, Double> entry : medias.entrySet()) {
                if (entry.getValue() < minMedia) {
                    minMedia = entry.getValue();
                    minCat = entry.getKey().toString();
                } else if (entry.getValue() == minMedia) {
                    minCat = "EMPATE";
                }
            }

            List<Double> allValues = new ArrayList<>();
            for (Map.Entry<Character, List<Double>> entry : registros.entrySet()) {
                allValues.addAll(entry.getValue());
            }
            
            double globalAverage = getMedia(allValues);

            System.out.println(categorias.get(maxCat) + "#" + categorias.get(minCat) + "#" + (medias.get('A') > globalAverage ? "SI" : "NO"));
        }
    }

    private static double getMedia(List<Double> list) {
        double ans = 0;
        for (double d : list) {
            ans += d;
        }
        return ans / list.size();
    }
}
