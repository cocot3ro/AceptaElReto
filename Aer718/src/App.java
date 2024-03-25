import java.util.*;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for (int pendientes = sc.nextInt(); pendientes != 0; pendientes = sc.nextInt()) {
            Set<Integer> set = new HashSet<>();

            int parejas = 0;

            for (int i = 0; i < pendientes; i++) {
                int pendiente = sc.nextInt();
                if (!set.add(pendiente)) {
                    set.remove(pendiente);
                    parejas++;
                }
            }

            System.out.println(parejas);
        }
    }
}
