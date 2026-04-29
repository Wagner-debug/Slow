import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Lanchonete {
    
    private HashMap<String, Produto> cardapio;
    private Queue<Pedido> filaDePedidos;
    private Stack<Pedido> historico;

    
    public Lanchonete() {
        this.cardapio = new HashMap<>();
        this.filaDePedidos = new LinkedList<>(); 
        this.historico = new Stack<>();
    }

    public void adicionarAoCardapio(Produto p) {
       
        this.cardapio.put(p.getCodigo(), p);
    }

    public Produto buscarProduto(String codigo) {
      
        return this.cardapio.get(codigo);
    }

    public void listarCardapio() {
       
        for (Produto p : cardapio.values()) {
            p.exibir();
        }
    }

  
    public void fazerPedido(Pedido pedido) {
       
        this.filaDePedidos.add(pedido);
    }

    public void atenderProximo() {
     
        if (filaDePedidos.isEmpty()) {
            System.out.println("Nenhum pedido na fila.");
            return;
        }

        Pedido atendido = filaDePedidos.poll();
        System.out.println("--- Atendendo Pedido ---");
        atendido.exibir();
        this.historico.push(atendido);
    }

    public void verUltimoAtendido() {
    
        if (historico.isEmpty()) {
            System.out.println("Nenhum pedido atendido ainda.");
            return;
        }

        System.out.println("--- Último Pedido Finalizado ---");
        historico.peek().exibir();
    }
}