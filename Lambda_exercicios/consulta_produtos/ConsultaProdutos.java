

import java.util.ArrayList;
import java.util.List;

public class ConsultaProdutos {

    public static List<Produto> filtrar(List<Produto> produtos, CriterioFiltro criterioFiltro){
        List<Produto> produtoList = new ArrayList<>();
        for (Produto produto: produtos) {
            if (criterioFiltro.testar(produto)){
                produtoList.add(produto);

            }
        }

        return produtoList;
    }

}
