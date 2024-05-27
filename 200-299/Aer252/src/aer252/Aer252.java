package aer252;

import java.util.Scanner;

public class Aer252 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String input;
        while (!((input = sc.nextLine()).equals("XXX"))) {
            input = input.replaceAll("[^a-zA-Z]", "").toLowerCase();
            
            int i = 0;
            int j = input.length() - 1;
            
            String ans = "SI";
            
            while (i < j) {
                if (input.charAt(i) != input.charAt(j)) {
                    ans = "NO";
                    break;
                }
                i++;
                j--;
            }

            System.out.println(ans);
        }
    }
    
}
