import java.util.Scanner;
import controller.PaisController;

public class Main {
	public static void main(String[] args) {
		/*
		 * Cria um objeto PaisController para nos auxiliar na criação e exibição de
		 * dados referentes aos países
		 */
		PaisController paisController = new PaisController();

		// Cria um objeto scanner para ler as entradas de teclado no console
		Scanner scanner = new Scanner(System.in);

		// Variavel de controle para nossa estrutura de repetição
		int opcao = -1;

		// Estrutura de repetição - Repete o laço enquando o usuário não digitar a opção
		// "0" - sair do sistema
		while (opcao != 0) {

			// Menu da nossa aplicação
			System.out.println("==== Menu ====");
			System.out.println("1. Adicionar país");
			System.out.println("2. Exibir lista de países");
			System.out.println("3. Remover país da lista"); // Nova funcionalidade
			System.out.println("4. Limpar lista"); // Nova funcionalidade
			System.out.println("0. Sair");
			System.out.print("Escolha uma opção: ");

			// Lê a opção de menu que foi digitada pelo usuário
			opcao = scanner.nextInt();

			// Estrutura condicional - Verifica o conteúdo da variável opcao
			switch (opcao) {

			// Opção do Menu 1 - Adicionar país
			case 1:
				
				// Escreva no console a mensagem informativa para o usuário saber o que o sistema está esperando que ele digite
				System.out.print("Digite o nome do país: ");
				// Consumir o '\n' após a leitura do número
				scanner.nextLine();
				// Cria uma String nome que armazena o nome do país que o usuário digitou no console
				String nome = scanner.nextLine();

				// Escreva no console a mensagem informativa para o usuário saber o que o sistema está esperando que ele digite
				System.out.print("Digite a capital do país " + nome + ": ");
				// Cria uma String capital que armazena a capital do país que o usuário digitou no console
				String capital = scanner.nextLine();

				// Utiliza o método adicionarPais do objeto paisController
				paisController.adicionarPais(nome, capital);
				break;

			case 2:
				// Utiliza o método exibirListaDePaises do objeto paisController
				paisController.exibirListaDePaises();
				break;

			case 3:
				// Escreva no console a mensagem informativa para o usuário saber o que o sistema está esperando que ele digite
				System.out.println("Digite o nome do país a ser removido: ");
				// Consumir o '\n' após a leitura do número
				scanner.nextLine();
				// Cria uma String nomePaisRemover que armazena o nome do país que o usuário digitou no console
				String nomePaisRemover = scanner.nextLine();

				// Utiliza o método removerPais do objeto paisController
				paisController.removerPais(nomePaisRemover);
				break;

			case 4:
				// Utiliza o método limparListaDePaises do objeto paisController
				paisController.limparListaDePaises();
				break;

			case 0:
				// Exibe mensagem informativa avisando o usuário que o sistema será finalizado
				System.out.println("Saindo...");
				break;

			default:
				// Exibe mensagem informativa avisando o usuário que ele digitou uma opção que não existe no menu
				System.out.println("Opção inválida.");
				break;
			}
		}
	}
}
