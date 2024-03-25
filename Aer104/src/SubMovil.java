public class SubMovil extends Movil {

    private final Movil pi;
    private final int di;
    private final Movil pd;
    private final int dd;

    SubMovil(int pi, int di, int pd, int dd) {
        this.pi = (pi != 0 ? new Peso(pi) : new SubMovil(Scanner.nextInt(), Scanner.nextInt(), Scanner.nextInt(), Scanner.nextInt()));
        this.di = di;
        this.pd = (pd != 0 ? new Peso(pd) : new SubMovil(Scanner.nextInt(), Scanner.nextInt(), Scanner.nextInt(), Scanner.nextInt()));
        this.dd = dd;
    }

    @Override
    boolean estaBalanceado() {
        if (!pi.estaBalanceado() || !pd.estaBalanceado()) {
            return false;
        }

        return pi.getPeso() * di == pd.getPeso() * dd;
    }

    @Override
    int getPeso() {
        return pi.getPeso() + pd.getPeso();
    }
}
