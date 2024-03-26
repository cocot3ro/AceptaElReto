import java.util.Scanner;

public class App {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int chan1 = sc.nextInt();
        int chan2 = sc.nextInt();
        
        while (!(chan1 == 0 && chan2 == 0)) {
            int max = Math.max(chan1, chan2);
            int min = Math.min(chan1, chan2);
            System.out.println(Math.min(max - min, 99 + min - max));
            
            chan1 = sc.nextInt();
            chan2 = sc.nextInt();
        }

        sc.close();
    }
    
}
