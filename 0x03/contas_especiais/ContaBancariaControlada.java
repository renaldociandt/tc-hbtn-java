

public class ContaBancariaControlada extends ContaBancariaBasica {

    public double saldoMinimo;
    public double valorPenalidade;

    public ContaBancariaControlada(String numeracao, double taxaJurosAnual, double saldoMinimo, double valorPenalidade) {
        super(numeracao, taxaJurosAnual);
        this.saldoMinimo = saldoMinimo;
        this.valorPenalidade = valorPenalidade;

    }
    @Override
    public void aplicarAtualizacaoMensal() {
        super.aplicarAtualizacaoMensal();
        if (getSaldo() < saldoMinimo || getSaldo() < 0){
            this.saldo = saldo - valorPenalidade;

        }


    }

    public double getSaldoMinimo() {
        return saldoMinimo;
    }

    public double getValorPenalidade() {
        return valorPenalidade;
    }
}
