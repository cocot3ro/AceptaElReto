import java.util.*;
public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        loop:
        for (int i = sc.nextInt(); i != 0; i = sc.nextInt()) {
            Set<Integer> set = new TreeSet<>();
            for (int j = 1; j < i; j++) {
                set.add(sc.nextInt());
            }

            int expected = 1;
            for (Integer integer : set) {
                if (integer != expected) {
                    System.out.println(expected);
                    continue loop;
                } else {
                    expected++;
                }
            }
            System.out.println(expected);
        }
    }
}