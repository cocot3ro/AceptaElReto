import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for (int maxWeight = sc.nextInt(), users = sc.nextInt(); !(maxWeight == 0 && users == 0); maxWeight = sc.nextInt(), users = sc.nextInt()) {
            Queue<Integer> q = new LinkedList<>();

            for (int i = 0; i < users; i++) {
                q.add(sc.nextInt());
            }

            int viajes = 0;
            int count = 0;
            while (q.size() > 1) {
                if (count == q.size()) {
                    viajes = users;
                    break;
                }
                int num1 = q.poll();
                if (num1 == maxWeight) {
                    viajes++;
                    continue;
                }
                int num2 = q.peek();

                if (num1 + num2 <= maxWeight) {
                    q.poll();
                    viajes++;
                } else {
                    q.add(num1);
                    count++;
                }
            }

            System.out.println(viajes + (q.size() == 1 ? 1 : 0));
        }

        sc.close();
    }
}
