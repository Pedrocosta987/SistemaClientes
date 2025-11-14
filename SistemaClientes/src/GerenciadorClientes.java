import java.util.ArrayList;

public class GerenciadorClientes {
    private ArrayList<Cliente> clientes = new ArrayList<>();

    public void adicionar(Cliente c) {
        clientes.add(c);
        System.out.println("Cliente adicionado com sucesso!");
    }

    public void listar() {
        if (clientes.isEmpty()) {
            System.out.println("Nenhum cliente cadastrado.");
            return;
        }
        for (Cliente c : clientes) {
            System.out.println(c);
        }
    }

    public void buscarPorNome(String nome) {
        for (Cliente c : clientes) {
            if (c.getNome().equalsIgnoreCase(nome)) {
                System.out.println("Cliente encontrado: " + c);
                return;
            }
        }
        System.out.println("Nenhum cliente encontrado com esse nome.");
    }

    public void remover(String nome) {
        for (Cliente c : clientes) {
            if (c.getNome().equalsIgnoreCase(nome)) {
                clientes.remove(c);
                System.out.println("Cliente removido!");
                return;
            }
        }
        System.out.println("Cliente não encontrado.");
    }
}
