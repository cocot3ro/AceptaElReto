import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n;

        while ((n = sc.nextInt()) != 0) {
            List<List<Character>> list = new ArrayList<>(n);

            for (int i = 0; i < n; i++) {
                list.add(new LinkedList<>());
                String fila = sc.next();
                for (int j = 0; j < n; j++) {
                    list.get(i).add(fila.charAt(j));
                }
            }

            char c;
            while ((c = sc.next().charAt(0)) != 'x') {
                int x = sc.nextInt();
                boolean b = x > 0;
                x = Math.abs(x) - 1;

                switch (c) {
                    case 'f' -> {
                        if (b) {
                            list.get(x).addFirst(list.get(x).removeLast());
                        } else {
                            list.get(x).addLast(list.get(x).removeFirst());
                        }
                    }

                    case 'c' -> {
                        if (b) {

                        } else {

                        }
                    }
                }
            }

            for (List<Character> fila : list) {
                for (Character character : fila) {
                    System.out.print(character);
                }
                System.out.println();
            }

            System.out.println("---");
        }
    }
}
