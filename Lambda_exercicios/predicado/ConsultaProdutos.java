

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class ConsultaProdutos {

    public static List<Produto> filtrar(List<Produto> produtos, Predicate<Produto> produtoPredicate){
        List<Produto> produtoList = new ArrayList<>();
        for (Produto produto: produtos) {
            if (produtoPredicate.test(produto)){
                produtoList.add(produto);

            }
        }

        return produtoList;
    }

}
