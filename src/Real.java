class Real extends Moeda {
    public Real(double valor) {
        super(valor);
    }

    @Override
    public double converterParaReal() {
        return valor; // Já está em Real e não precisa de conversão
    }

    @Override
    public String toString() {
        return "Real: " + valor;
    }
}