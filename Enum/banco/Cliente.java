

import java.util.ArrayList;
import java.util.List;

public class Cliente {

    private String nome;
    private List<Double> transacoes = new ArrayList<>();

    public Cliente(String nome, double transacoes) {
        this.nome = nome;
        this.transacoes.add(transacoes);
    }

    public void adicionarTransacao(double valorTransacao){
        transacoes.add(valorTransacao);

    }

    public String getNome() {
        return nome;
    }

    public List<Double> getTransacoes() {
        return transacoes;
    }


}
