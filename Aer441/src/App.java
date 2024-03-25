import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        while (sc.hasNext()) { //pido numeros y ejecuto mientras queden
            String entrada = sc.nextLine().replace(".", ""); //cojo el primer numero "1.234.567" y le quito los puntos "1.234.567" => "1234567"

            int[] num = new int[entrada.length() + 1]; //creo un array de enteros del tamaño del numero anterior ("1234567") +1
            // ahora el array esta vacio [0,0,0,0,0,0,0,0]
            for (int i = 0; i < num.length -1; i++) { //le añado cada digito del numero al arary desde el final hasta el principio [0,1,2,3,4,5,6,7]
                num[num.length - 1 - i] = Integer.parseInt(entrada.charAt(entrada.length() - 1 - i) + ""); //           ultimo valor^     ⇕⇕      ^primer valor
            } // [0,0,0,0,0,0,0,0]=>[0,0,0,0,0,0,0,7]=>[0,0,0,0,0,0,6,7]=>[0,0,0,0,0,5,6,7]=>[0,0,0,0,4,5,6,7]=>[0,0,0,3,4,5,6,7]=>[0,0,2,3,4,5,6,7]=>[0,1,2,3,4,5,6,7]

            for (int i = 0; i < num.length; i++){ //bucle que recorre el array
                if (num[num.length - 1 - i] + 1 > 9) { //si el ultimo numero +1 es mayor que 9 se pone a 0 (9+1=10) y se pasa al siguiente valor (acarreo) [0,1,2,3,4,5,6,7] => [0,1,2,3,4,5,6,8]
                    num[num.length - 1 - i] = 0; //                                                                                                        [0,1,2,3,4,5,6,9] => [0,1,2,3,4,5,7,0]
                } else { //                                                                                                                                [0,1,2,9,9,9,9,9] => [0,1,3,0,0,0,0,0]
                    num[num.length - 1 - i]++; //si al sumarle 1 no da mas de 9 se incrementa y se para el bucle puesto que no hay acarreo.
                    break;
                }
            }

            String resultado = ""; //string que recoge los valores del array y los pasa a un string
            for (int i = 0; i < num.length; i++) { //[0,1,2,3,4,5,6,8] => "01234568"
            resultado += num[i]; // ""=>"0"=>"01"=>"012"=>"0123"=>"01234"=>"012345"=>"0123456"=>"01234568"
            }
            
            while (resultado.startsWith("0")) { //si str1 tiene 0 al principio se lo quita, lo comprueba hasta que no comienze en 0
                resultado = resultado.substring(1, resultado.length()); //	"01234568"=>"1234568"; "10"=>"10"
            }
            
            String resultadoConPuntos = "";
            while (resultado.length() > 3) { // si el numero tiene mas de 3 digitos tiene que llevar punto
                resultadoConPuntos = "." + resultado.substring(resultado.length() - 3, resultado.length()) + resultadoConPuntos; //       se pone un punto y los tres ultimos digitos ""=>".568" 
                resultado = resultado.substring(0, resultado.length() - 3); //se quitan los tres ultimos numeros asignados antes "1234568"=>"1234"
            } //en la siguiente iteracion del bucle se recogen los tres ultimos digitos de resultado(1234) mas un punto antes y los digitos con punto anteriores (".568")

//                                                                                                   "1234568"=>"1234"=>"1"      ""=>".568"=>".234.568"
//                                                                                                                       ╦                    ╚═══╦══╝
//                                                                                                                       ╩                        ║
            resultadoConPuntos = resultado + resultadoConPuntos; //se le añade a lo que sobra de resultado ".234.3568"=>"1.234.568"               ║
            System.out.println(resultadoConPuntos); //imprime resultado "1.234.568"                                       ╚═══╦══╝                ║
        } //                                                                                                                  ╚═══════════════════╝
        sc.close();
    }
}
