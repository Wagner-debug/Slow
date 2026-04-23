import java.util.*;

public class Produto {
    private String nome;
    private double preco;
    private int codigo;

    public Produto(String nome, double preco, int codigo) {
        this.nome = nome;
        this.preco = preco;
        this.codigo = codigo;
    }

    // Getters

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public int getCodigo() {
        return codigo;
    }

    // Setters

    public boolean setNome(String nome) {
        if (nome == null || nome.trim().split("\\s+").length < 2) {
            return false;
        }
        this.nome = nome.trim();
        return true;
    }

    public double setPreco(double preco) {
        this.preco = preco;
        return preco;
    }

    public int setCodigo(int codigo) {
        this.codigo = codigo;
        return codigo;
    }

    public void categoria() {
        lanche: if (codigo >= 100 && codigo < 200) {
            System.out.println("Categoria: Lanche");
            break lanche;
        }
        bebida: if (codigo >= 200 && codigo < 300) {
            System.out.println("Categoria: Bebida");
            break bebida;
        }

    }

    public void exibirInformacoes() {
        System.out.println("Produto: " + nome);
        System.out.println("Preço: R$ " + preco);
        System.out.println("Código: " + codigo);

    }

    public String getCategoriaNome() {
        if (codigo >= 100 && codigo < 200)
            return "Lanche";
        if (codigo >= 200 && codigo < 300)
            return "Bebida";
        return "Outros";
    }

    public static class p {
        private String nome;
        private double preco;
        private int codigo;

        public p (String nome, double preco, int codigo) {
            this.nome = nome;
            this.preco = preco;
            this.codigo = codigo;
        }

        public String getNome() {
            return nome;
        }

        public double getPreco() {
            return preco;
        }

        public int getCodigo() {
            return codigo;
        }

        public String getCategoria() {
            if (codigo >= 100 && codigo < 200)
                return "Lanche";
            if (codigo >= 200 && codigo < 300)
                return "Bebida";
            return "Geral";
        }
    }
}