import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Lista lista;

        while (sc.hasNext()) {
            lista = new Lista();
            String entrada = sc.nextLine();
            if (!entrada.contains("-") && !entrada.contains("+") && !entrada.contains("*") && !entrada.contains("3")) {
                System.out.println(entrada);
                continue;
            }

            for (int i = 0; i < entrada.length(); i++) {
                lista.insertar(entrada.charAt(i));
            }

            lista.imprimir();
        }

        sc.close();
    }
}

class Lista {
    private Nodo primero;
    private Nodo cursor;

    Lista() {
        this.primero = this.cursor = null;
    }

    void insertar(char dato) {
        if (dato == '-') { // inicio
            this.cursor = this.primero;
        } else if (dato == '+') { // fin
            this.cursor = null;
        } else if (dato == '*') { // derecha
            if (this.cursor == null) return;
            this.cursor = this.cursor.getSiguiente();
        } else if (dato == '3') { // supr
            if (this.cursor != null)
            this.borrar();
        } else {
            this.insertarDato(dato);
        }
    }

    private void borrar() {
        if (this.cursor == this.primero) {
            this.primero = this.primero.getSiguiente();
            this.cursor = this.primero;
            return;
        }

        Nodo tmp = getAnterior(this.cursor);
        tmp.setSiguiente(this.cursor.getSiguiente());
        this.cursor = this.cursor.getSiguiente();
    }

    private void insertarDato(char dato) {
        if (this.primero == null) {
            this.primero = new Nodo(dato);
            this.cursor = this.primero.getSiguiente();
        } else if (this.cursor == this.primero) {
            this.primero = new Nodo(dato, this.primero);
        } else {
            Nodo anterior = (this.cursor == null ? getUltimo() : getAnterior(this.cursor));
            Nodo tmp = new Nodo(dato, this.cursor);
            anterior.setSiguiente(tmp);
            this.cursor = tmp.getSiguiente();
        }
    }

    private Nodo getUltimo() {
        Nodo tmp = this.primero;
        while (tmp.getSiguiente() != null) {
            tmp = tmp.getSiguiente();
        }
        return tmp;
    }

    private Nodo getAnterior(Nodo nodo) {
        Nodo tmp = this.primero;
        while (tmp.getSiguiente() != nodo) {
            tmp = tmp.getSiguiente();
        }
        return tmp;
    }

    void imprimir() {
        this.imprimir(this.primero);
        System.out.println();
    }

    private void imprimir(Nodo nodo) {
        if (nodo == null) return;

        System.out.print(nodo.getDato());
        this.imprimir(nodo.getSiguiente());
    }
}

class Nodo {
    private char dato;
    private Nodo sig;

    Nodo(char dato) {
        this(dato, null);
    }

    Nodo(char dato, Nodo sig) {
        this.dato = dato;
        this.sig = sig;
    }

    char getDato() {
        return this.dato;
    }

    Nodo getSiguiente() {
        return this.sig;
    }

    void setSiguiente(Nodo sig) {
        this.sig = sig;
    }
}
