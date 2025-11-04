import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        casos:
        for (int personas = sc.nextInt(); personas != 0; personas = sc.nextInt()) {
            sc.nextLine();
            String fechas = sc.nextLine();
            Set<String> setFechas = new HashSet<>();
            for (String fecha : fechas.split(" ")) {
                if (!setFechas.add(fecha.substring(0, fecha.lastIndexOf("/")))) {
                    System.out.println("SI");
                    continue casos;
                }
            }
            System.out.println("NO");
        }

        sc.close();
    }
}
