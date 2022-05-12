

public class Pedido{

    private double percentualDesconto;
    private ItemPedido[] item;

    private double desconto;

    public Pedido(double percentualDesconto, ItemPedido[] item) {
        this.setPercentualDesconto(percentualDesconto);
        this.item = item;
    }

    public  void apresentarResumoPedido(){
        double valor = 0;
        System.out.println("------- RESUMO PEDIDO -------");
        for(ItemPedido itens: item){
            String nome = itens.getProduto().getClass().getSimpleName();
            String titulo = itens.getProduto().getTitulo();
            valor += itens.getProduto().obterPrecoLiquido() * itens.getQuantidade();
            desconto = valor * percentualDesconto;
            System.out.printf("Tipo: %s  Titulo: %s  Preco: %.2f  Quant: %d  Total: %.2f\n", nome, titulo,
                    itens.getProduto().obterPrecoLiquido(), itens.getQuantidade(),(itens.getProduto().obterPrecoLiquido() * itens.getQuantidade()));

        }

        System.out.println("----------------------------");
        System.out.printf("DESCONTO: %.2f\n", desconto);
        System.out.printf("TOTAL PRODUTOS: %.2f\n", valor);
        System.out.println("----------------------------");
        System.out.printf("TOTAL PEDIDO: %.2f\n", this.calcularTotal());
        System.out.println("----------------------------");
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
