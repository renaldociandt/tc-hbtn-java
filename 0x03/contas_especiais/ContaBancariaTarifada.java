package contas_especiais;

import conta_basica.ContaBancariaBasica;
import conta_basica.exceptions.OperacaoInvalidaException;

public class ContaBancariaTarifada extends ContaBancariaBasica {

    private int quantidadeTransacoes;

    public ContaBancariaTarifada(String numeracao, double taxaJurosAnual, int quantidadeTransacoes) {
        super(numeracao, taxaJurosAnual);
        this.quantidadeTransacoes = quantidadeTransacoes;
    }

    public ContaBancariaTarifada(String numeracao, double taxaJurosAnual) {
        super(numeracao, taxaJurosAnual);

    }

    @Override
    public void  depositar(double valor) throws OperacaoInvalidaException {
        super.depositar(valor - ( 0.10));

    }

    @Override
    public void sacar(double valor) throws OperacaoInvalidaException {
        super.sacar(valor + ( 0.10));

    }

    public int getQuantidadeTransacoes() {
        return quantidadeTransacoes;
    }
}
