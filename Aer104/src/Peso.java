public class Peso extends Movil {
    private final int peso;

    Peso(int peso) {
        this.peso = peso;
    }

    @Override
    int getPeso() {
        return this.peso;
    }

    @Override
    boolean estaBalanceado() {
        return true;
    }

}
