package aer467;

import java.util.Scanner;

public class Aer467 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int casos = sc.nextInt();
        
        for (int i = 0; i < casos; i++) {
            String palabra1 = sc.next();
            sc.next();
            String palabra2 = sc.next();
            
            System.out.println(palabra1.equalsIgnoreCase(palabra2)?"TAUTOLOGIA":"NO TAUTOLOGIA");
        }
    }
    
}
