import java.util.Scanner;
import java.util.Stack;

public class App {
    static String parentesisBalanceados(String expresion) {
        Stack<Character> pila = new Stack<>();
        for (int i = 0; i < expresion.length(); i++) {
            switch (expresion.charAt(i)) {
                case '(': case '[': case '{':
                    pila.push(expresion.charAt(i));
                    break;
                case ')':
                    if (pila.isEmpty() || pila.lastElement() != '(')
                        return "NO";
                    pila.pop();
                    break;
                case ']':
                    if (pila.isEmpty() || pila.lastElement() != '[')
                        return "NO";
                    pila.pop();
                    break;
                case '}':
                    if (pila.isEmpty() || pila.lastElement() != '{')
                        return "NO";
                    pila.pop();
                    break;
            }
        }
        return (pila.isEmpty() ? "YES" : "NO");
    }
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            System.out.println(parentesisBalanceados(sc.nextLine()));
        }
        sc.close();
    }
}
