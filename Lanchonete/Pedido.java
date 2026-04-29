import java.util.ArrayList;

public class Pedido {
    
    private String nomeCliente;
    private ArrayList<Produto> itens; 

    public Pedido(String nomeCliente) {
        this.nomeCliente = nomeCliente;
        this.itens = new ArrayList<>(); 
    }

    
    public void adicionarItem(Produto p) {
        this.itens.add(p);
    }

    
    public double calcularTotal() {
        double total = 0;

        
        for (Produto p : itens) {
            total += p.getPreco();
        }

        
        if (total > 50.00) {
            total = total * 0.90;
        }

        return total;
    }

    
    public void exibir() {
        System.out.println("=== Pedido de: " + this.nomeCliente + " ===");

        
        for (Produto p : itens) {
            
            String precoItem = String.format("%.2f", p.getPreco()).replace('.', ',');
            System.out.printf("%s - R$ %s%n", p.getNome(), precoItem);
        }

        
        double totalFinal = calcularTotal();
        String totalFormatado = String.format("%.2f", totalFinal).replace('.', ',');
        System.out.println("Total: R$ " + totalFormatado);
    }
}