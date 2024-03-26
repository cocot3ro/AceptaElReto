public class App {

    public static void main(String[] args) {
        Movil movil;
        for (int pi = Scanner.nextInt(), di = Scanner.nextInt(), pd = Scanner.nextInt(), dd = Scanner.nextInt(); !(pi == 0 && di == 0 && pd == 0 && dd == 0); pi = Scanner.nextInt(), di = Scanner.nextInt(), pd = Scanner.nextInt(), dd = Scanner.nextInt()) {
            movil = new SubMovil(pi, di, pd, dd);
            System.out.println(movil.estaBalanceado() ? "SI" : "NO");
        }

    }
}