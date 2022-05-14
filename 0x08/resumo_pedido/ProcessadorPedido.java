

import provedores.*;

public class ProcessadorPedido {

    ProvedorFrete provedorFrete;
    private Frete frete = new Frete();

    public ProcessadorPedido(ProvedorFrete provedorFrete) {

        this.provedorFrete = provedorFrete;
    }


    public void processar(Pedido pedido){
        pedido.setFrete(frete);
        frete.setTipoProvedorFrete(provedorFrete.obterTipoProvedorFrete());
        double valor = provedorFrete.calcularFrete(pedido.getPeso(), pedido.getTotal());
        frete.setValor(valor);


    }
}
