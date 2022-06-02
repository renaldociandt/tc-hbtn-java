

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Consulta {

    public static List<Produto> obterLivrosDoPedido(Pedido pedido){
        List<Produto> produtoList = new ArrayList<>();
        return pedido.getProdutos().stream().filter(produto -> produto.getCategoria() == CategoriaProduto.LIVRO).collect(Collectors.toList());
    }


    public static Produto obterProdutoMaiorPreco(List<Produto> produtoList){
        return produtoList.stream().sorted(Comparator.comparing(Produto::getPreco).reversed()).collect(Collectors.toList()).get(0);
    }
}
