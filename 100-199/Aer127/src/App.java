import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for (int casos = sc.nextInt(); casos > 0; casos--) {
            List<String> nombres = new ArrayList<>();

            String nombre;
            while (!(nombre = sc.next()).equals("F")) {
                nombres.add(nombre);
            }

            int camas = sc.nextInt();
            int palabras = sc.nextInt();

            if (camas == 0) {
                System.out.println("NADIE TIENE CAMA");
                continue;
            }

            if (camas >= nombres.size()) {
                System.out.println("TODOS TIENEN CAMA");
                continue;
            }

            for (Iterator<String> it = nombres.iterator(); nombres.size() > camas; ) {
                for (int i = 0; i < palabras; i++) {
                    if (!it.hasNext()) {
                        it = nombres.iterator();
                    }
                    it.next();
                }
                it.remove();
            }

            StringBuilder sb = new StringBuilder();
            for (String n : nombres) {
                sb.append(n).append(" ");
            }
            System.out.println(sb.toString().trim());
        }
    }
}
