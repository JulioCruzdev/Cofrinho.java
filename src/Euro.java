class Euro extends Moeda {
    private static final double TAXA_CONVERSAO = 6.2; // Cotação arredondada 24/03

    public Euro(double valor) {
        super(valor);
    }

    @Override
    public double converterParaReal() {
        return valor * TAXA_CONVERSAO;
    }

    @Override
    public String toString() {
        return "Euro: " + valor;
    }
}