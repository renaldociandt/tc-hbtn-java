package desconto_eletronicos;

public class Produto {

    private int codigo;
    private String nome;
    private CategoriaProduto categoria;
    private double preco;

    public Produto(int codigo, String nome, CategoriaProduto categoria, double preco) {
        this.codigo = codigo;
        this.nome = nome;
        this.categoria = categoria;
        this.preco = preco;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public CategoriaProduto getCategoria() {
        return categoria;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    @Override
    public String toString(){
        return "[" + getCodigo() + "] " + getNome() + " " + getCategoria() + " R$ " + String.format("%.2f", getPreco());
    }


}