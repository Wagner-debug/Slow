import java.util.Map;
import java.util.HashMap;
import java.util.Scanner;

class Lanchonete {
    private Map<Integer, Produto> cardapio = new HashMap<>();
    private Scanner leitor = new Scanner(System.in);

    public Lanchonete() {
        cardapio.put(101, new Produto("Hambúrguer", 25.0, 101));
        cardapio.put(102, new Produto("X-Salada", 30.0, 102));
        cardapio.put(201, new Produto("Refrigerante", 10.0, 201));
        cardapio.put(202, new Produto("Suco Natural", 15.0, 202));
    }

    public void menuPrincipal() {
        Pedido pedido = new Pedido(); // Aqui o erro desaparece
        System.out.print("Nome do Cliente: ");
        pedido.setNomeCliente(leitor.nextLine());

        int opcao = 0;
        while (opcao != 4) {
            System.out.println("\n1. Cardápio | 2. Add Item | 3. Remover | 4. Finalizar");
            System.out.print("Escolha: ");
            try {
                opcao = Integer.parseInt(leitor.nextLine());
            } catch (Exception e) { opcao = 0; }

            if (opcao == 1) {
                for (Produto p : cardapio.values()) {
                    System.out.println(p.getCodigo() + " - " + p.getNome() + " (R$ " + p.getPreco() + ")");
                }
            } else if (opcao == 2) {
                System.out.print("Código: ");
                int c = Integer.parseInt(leitor.nextLine());
                if (cardapio.containsKey(c)) pedido.adicionarProduto(cardapio.get(c));
            } else if (opcao == 3) {
                System.out.print("Código para remover: ");
                int c = Integer.parseInt(leitor.nextLine());
                pedido.removerProdutoPorCodigo(c);
            }
        }
        pedido.fecharPedido();
        pedido.exibirResumo();
    }
}