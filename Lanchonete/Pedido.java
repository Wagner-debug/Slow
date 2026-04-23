import java.util.List;
import java.util.ArrayList;

class Pedido {
    private List<Produto> produtos = new ArrayList<>();
    private String nomeCliente;
    private double valorTotal;

    public void setNomeCliente(String nome) { this.nomeCliente = nome; }

    public void adicionarProduto(Produto p) { 
        produtos.add(p); 
        System.out.println(p.getNome() + " adicionado.");
    }

    public void removerProdutoPorCodigo(int codigo) {
        produtos.removeIf(p -> p.getCodigo() == codigo);
    }

    public void fecharPedido() {
        valorTotal = 0;
        for (Produto p : produtos) valorTotal += p.getPreco();
        if (valorTotal > 100) valorTotal *= 0.9;
    }

    public void exibirResumo() {
        System.out.println("\n--- RESUMO ---");
        System.out.println("Cliente: " + nomeCliente);
        for (Produto p : produtos) System.out.println("- " + p.getNome());
        System.out.printf("Total: R$ %.2f\n", valorTotal);
    }
}