import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Arbol arbol;

        int casos = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < casos; i++) {
            String arbolString = sc.nextLine();
            arbol = new Arbol(arbolString.toCharArray());
            System.out.println(arbol.altura());
        }

        sc.close();
    }
}

class Arbol {
    private Nodo raiz;
    private char[] arbolString;
    private int posArray = 0;

    Arbol(char[] arbolString) {
        this.raiz = null;
        this.arbolString = arbolString;
        this.crearArbol();
    }

    private void crearArbol() {
        char dato = this.arbolString[0];
        if (dato == '.') {
            this.raiz = null;
        } else {
            this.raiz = new Nodo(dato);
            ayudanteCrearArbol(this.raiz);
        }
    }

    private void ayudanteCrearArbol(Nodo nodo) {
        char dato;

        this.posArray++;
        dato = this.arbolString[this.posArray];
        if (dato != '.') {
            nodo.setNodoIzq(new Nodo(dato));
            ayudanteCrearArbol(nodo.getNodoIzq());
        }

        this.posArray++;
        dato = this.arbolString[this.posArray];
        if (dato != '.') {
            nodo.setNodoDer(new Nodo(dato));
            ayudanteCrearArbol(nodo.getNodoDer());
        }

    }

    int altura() {
        return altura(this.raiz);
    }

    private int altura(Nodo nodo) {
        if (nodo == null) return 0;
        return 1 + Math.max(altura(nodo.getNodoIzq()), altura(nodo.getNodoDer()));
    }
}

class Nodo {
    private Nodo nodoIzq;
    private char dato;
    private Nodo nodoDer;

    Nodo(char dato) {
        this.dato = dato;
        this.nodoIzq = nodoDer = null;
    }

    Nodo getNodoIzq() {
        return this.nodoIzq;
    }

    void setNodoIzq(Nodo nodo) {
        this.nodoIzq = nodo;
    }

    Nodo getNodoDer() {
        return this.nodoDer;
    }

    void setNodoDer(Nodo nodo) {
        this.nodoDer = nodo;
    }

    char getDato() {
        return this.dato;
    }
}
