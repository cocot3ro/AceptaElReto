package aer313;

import java.util.Scanner;

public class Aer313 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int casos = sc.nextInt();
        
        for (int i = 0; i < casos; i++) {
            
            int s = sc.nextInt();
            int c = sc.nextInt();
            System.out.println((s + c) >= 0?"SI":"NO");
        }
    }
    
}
