import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Cofrinho cofrinho = new Cofrinho();

        while (true) {
            System.out.println("\nMenu:"); // Menu de opções para o usuário escolher
            System.out.println("1. Adicionar moeda");
            System.out.println("2. Remover moeda");
            System.out.println("3. Listar moedas");
            System.out.println("4. Calcular total em Reais");
            System.out.println("5. Sair");
            System.out.print("Escolha uma opção: ");

            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Escolha a moeda (1- Dólar, 2- Euro, 3- Real): ");
                    int tipo = scanner.nextInt();
                    System.out.print("Digite o valor: ");
                    double valor = scanner.nextDouble();

                    Moeda novaMoeda = null;
                    if (tipo == 1) novaMoeda = new Dolar(valor);
                    else if (tipo == 2) novaMoeda = new Euro(valor);
                    else if (tipo == 3) novaMoeda = new Real(valor);

                    if (novaMoeda != null) {
                        cofrinho.adicionarMoeda(novaMoeda);
                        System.out.println("Moeda adicionada!");
                    } else {
                        System.out.println("Opção inválida.");
                    }
                    break;

                case 2:
                    System.out.println("Escolha o índice da moeda para remover:");
                    cofrinho.listarMoedas();
                    int index = scanner.nextInt();
                    cofrinho.removerMoeda(index);
                    break;

                case 3:
                    cofrinho.listarMoedas();
                    break;

                case 4:
                    System.out.println("Total em Reais: R$ " + cofrinho.calcularTotalEmReais());
                    break;

                case 5:
                    System.out.println("Saindo...");
                    scanner.close();
                    return;

                default:
                    System.out.println("Opção inválida.");
            }
        }
    }
}