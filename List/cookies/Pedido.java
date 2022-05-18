

import java.util.ArrayList;
import java.util.List;

public class Pedido {

    private List<PedidoCookie> cookies = new ArrayList<>();

    public Pedido() {

    }

    public Pedido(List<PedidoCookie> cookies) {
        this.cookies = cookies;
    }

    public  void adicionarPedidoCookie(PedidoCookie pedidoCookie){
        this.cookies.add(pedidoCookie);

    }

    public int obterTotalCaixas(){
        int count = 0;
        for (PedidoCookie quantidade: cookies){
           count = count + quantidade.getQuantidadeCaixas();

        }

        return count;

    }

    public int removerSabor(String sabor){
        int count = 0;
        for (int x = 0; x < cookies.size();  x++){
            if (cookies.get(x).getSabor().equals(sabor)){
                count = count + cookies.get(x).getQuantidadeCaixas();
                cookies.remove(x);

            }

        }return count;

    }
}
