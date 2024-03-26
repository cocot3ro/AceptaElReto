import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for (int potitos = sc.nextInt(); potitos != 0; potitos = sc.nextInt()) {
            sc.nextLine();
            Set<String> si = new HashSet<>();
            Set<String> no = new TreeSet<>();

            for (int potito = 0; potito < potitos; potito++) {
                String[] s = sc.nextLine().split(" ");

                if (s[0].equals("SI:")) {
                    for (int i = 1; i < s.length - 1; i++) {
                        si.add(s[i]);
                        no.remove(s[i]);
                    }
                } else {
                    for (int i = 1; i < s.length - 1; i++) {
                        if (!si.contains(s[i])) {
                            no.add(s[i]);
                        }
                    }
                }

            }

            System.out.println(no.toString().replaceAll("[\\[\\],]", ""));
        }
    }
}
