import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        GerenciadorClientes gc = new GerenciadorClientes();

        int opcao;

        do {
            System.out.println("\n=== SISTEMA DE CLIENTES ===");
            System.out.println("1 - Adicionar cliente");
            System.out.println("2 - Listar clientes");
            System.out.println("3 - Buscar cliente por nome");
            System.out.println("4 - Remover cliente");
            System.out.println("0 - Sair");
            System.out.print("Escolha: ");
            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("Nome: ");
                    String nome = sc.nextLine();

                    System.out.print("Email: ");
                    String email = sc.nextLine();

                    System.out.print("Idade: ");
                    int idade = sc.nextInt();
                    sc.nextLine();

                    Cliente c = new Cliente(nome, email, idade);
                    gc.adicionar(c);
                    break;

                case 2:
                    gc.listar();
                    break;

                case 3:
                    System.out.print("Nome para buscar: ");
                    String busca = sc.nextLine();
                    gc.buscarPorNome(busca);
                    break;

                case 4:
                    System.out.print("Nome para remover: ");
                    String rm = sc.nextLine();
                    gc.remover(rm);
                    break;

                case 0:
                    System.out.println("Saindo...");
                    break;

                default:
                    System.out.println("Opção inválida!");
            }

        } while (opcao != 0);

        sc.close();
    }
}

