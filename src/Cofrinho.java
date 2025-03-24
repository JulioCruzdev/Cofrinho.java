import java.util.ArrayList;
// Onde vai ser armazenado as moedas
class Cofrinho {
    private ArrayList<Moeda> moedas;

    public Cofrinho() {
        this.moedas = new ArrayList<>();
    }
    //adiciona uma moeda para o cofrinho
    public void adicionarMoeda(Moeda moeda) {
        moedas.add(moeda);
    }

    public void removerMoeda(int index) {
        if (index >= 0 && index < moedas.size()) {
            moedas.remove(index);
            System.out.println("Moeda removida com sucesso.");
        } else {
            System.out.println("Índice inválido.");
        }
    }

    public void listarMoedas() {
        if (moedas.isEmpty()) {
            System.out.println("Cofrinho vazio.");
        } else {
            for (int i = 0; i < moedas.size(); i++) {
                System.out.println(i + " - " + moedas.get(i));
            }
        }
    }

    public double calcularTotalEmReais() {
        double total = 0;
        for (Moeda moeda : moedas) {
            total += moeda.converterParaReal();
        }
        return total;
    }
}