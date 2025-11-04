import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        for (int b = sc.nextInt(), p = sc.nextInt(); !(b == 0 && p == 0); b = sc.nextInt(), p = sc.nextInt()) {

            if (b == 1 || p == 1) {
                System.out.println(b);
                continue;
            }

            Queue<Integer> cola = new LinkedList<>();

            for (int i = 1; i <= b; i++) {
                cola.add(i);
            }

            while (cola.size() > 1) {
                int indexRemove = p;

                if (indexRemove > cola.size())
                    while ((indexRemove -= cola.size()) > cola.size());

                for (int i = 1; i < indexRemove; i++) {
                    cola.add(cola.remove());
                }
                cola.remove();
            }
            System.out.println(cola.remove());
        }
        sc.close();
    }
}
