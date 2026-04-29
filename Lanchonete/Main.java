public class Main {
    public static void main(String[] args) {
    
        Lanchonete lanchonete = new Lanchonete();

        lanchonete.adicionarAoCardapio(new Produto("X01", "X-Burguer", 15.00, "Lanche"));
        lanchonete.adicionarAoCardapio(new Produto("X02", "X-Salada", 18.00, "Lanche"));
        lanchonete.adicionarAoCardapio(new Produto("R01", "Coca-Cola", 7.00, "Bebida"));
        lanchonete.adicionarAoCardapio(new Produto("R02", "Suco Natural", 9.00, "Bebida"));
        lanchonete.adicionarAoCardapio(new Produto("S01", "Pudim", 10.00, "Sobremesa"));

        System.out.println("--- CARDÁPIO DA LANCHONETE ---");
        lanchonete.listarCardapio();
        System.out.println();

        Pedido p1 = new Pedido("João");
        Pedido p2 = new Pedido("Maria");
        Pedido p3 = new Pedido("Carlos");

        p1.adicionarItem(lanchonete.buscarProduto("X01"));
        p1.adicionarItem(lanchonete.buscarProduto("R01"));
        
        p2.adicionarItem(lanchonete.buscarProduto("X02"));
        p2.adicionarItem(lanchonete.buscarProduto("X02"));
        p2.adicionarItem(lanchonete.buscarProduto("X02")); 

        p3.adicionarItem(lanchonete.buscarProduto("S01"));
        p3.adicionarItem(lanchonete.buscarProduto("R02"));

        lanchonete.fazerPedido(p1);
        lanchonete.fazerPedido(p2);
        lanchonete.fazerPedido(p3);

        System.out.println("Iniciando atendimentos...");
        lanchonete.atenderProximo();
        lanchonete.atenderProximo(); 
        lanchonete.atenderProximo(); 

        System.out.println("\nTentando atender com fila vazia:");
        lanchonete.atenderProximo();

        System.out.println();
        lanchonete.verUltimoAtendido();
    }
}