package aer116;

import java.util.Scanner;

public class Aer116 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int x = sc.nextInt();
        if (x >= 0 && x <= 5) {
            for (int i = 0; i < x; i++) {
                System.out.println("Hola mundo.");
            }
        }
    }
}
