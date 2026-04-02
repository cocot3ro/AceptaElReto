import java.util.Scanner;

public class Aer371 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int cerillasLado;
        while ((cerillasLado = sc.nextInt()) != 0) {
            int cerillas = 0;
            for (int i = 0; i < cerillasLado; i++) {
              cerillas += (3 * (i + 1));
            }
            System.out.println(cerillas);
        }
    }
}
