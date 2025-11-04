package aer368;

import java.util.Scanner;

public class Aer368 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int h = sc.nextInt();
        int c = sc.nextInt();
        
        while (!(h == 0 && c == 0)){
            int t = 10;
            while (h > c) {
                h -= c;
                t += 10;
            }
            System.out.println(t);
            h = sc.nextInt();
            c = sc.nextInt();
        }
        
    }
    
}
