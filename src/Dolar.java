class Dolar extends Moeda {
    private static final double TAXA_CONVERSAO = 5.8; // Cotação arredondada 24/03

    public Dolar(double valor) {
        super(valor);
    }

    @Override
    public double converterParaReal() {
        return valor * TAXA_CONVERSAO;
    }

    @Override
    public String toString() {
        return "Dólar: " + valor;
    }
}