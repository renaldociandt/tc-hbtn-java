

public class Pedido{

    private double percentualDesconto;
    private ItemPedido[] item;

    public Pedido(double percentualDesconto, ItemPedido[] item) {
        this.setPercentualDesconto(percentualDesconto);
        this.item = item;
    }

    public double calcularTotal(){
        double total = 0;

        for (ItemPedido x: item){
           total = total + (x.getQuantidade() * x.getProduto().obterPrecoLiquido());
        }
        return total - total * percentualDesconto;
    }

    public Double getPercentualDesconto() {
        return percentualDesconto;
    }

    public void setPercentualDesconto(Double percentualDesconto) {

        this.percentualDesconto = percentualDesconto/100;
    }

    public ItemPedido[] getItem() {
        return item;
    }

    public void setItem(ItemPedido[] item) {
        this.item = item;
    }
}
