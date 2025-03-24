abstract class Moeda {
    protected double valor;

    public Moeda(double valor) {
        this.valor = valor;
    }

    public abstract double converterParaReal();

    @Override
    public String toString() {
        return "Moeda de valor: " + valor;
    }
}