import java.util.Scanner;
import controller.PaisController;

public class Main {
    public static void main(String[] args) {
        PaisController paisController = new PaisController();
        Scanner scanner = new Scanner(System.in);

        int opcao = -1;
        while (opcao != 0) {
            System.out.println("==== Menu ====");
            System.out.println("1. Adicionar país");
            System.out.println("2. Exibir lista de países");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Digite o nome do país: ");
                    scanner.nextLine(); // Consumir o '\n' após a leitura do número
                    String nome = scanner.nextLine();
                    paisController.adicionarPais(nome);
                    break;
                case 2:
                    paisController.exibirListaDePaises();
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida.");
                    break;
            }
        }
    }
}
