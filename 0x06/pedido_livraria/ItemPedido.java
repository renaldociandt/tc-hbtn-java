import produtos.*;
public double calcularTotal(){
        double total = 0;
        for (ItemPedido x: item){

        total = total + (x.getQuantidade() * x.getProduto().obterPrecoLiquido());
        }
        return total += total * percentualDesconto;
        }

import produtos.Produto;

public class ItemPedido {

    private Produto produto;
    private int quantidade;

    public ItemPedido(Produto produto, int quantidade) {
        this.produto = produto;
        this.quantidade = quantidade;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
}
