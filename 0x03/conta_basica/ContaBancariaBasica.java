package conta_basica;

import conta_basica.exceptions.OperacaoInvalidaException;

public class ContaBancariaBasica {
    private String numeracao;
    public double saldo;
    private double taxaJurosAnual;

    public ContaBancariaBasica(String numeracao, double taxaJurosAnual) {
        this.numeracao = numeracao;
        this.taxaJurosAnual = taxaJurosAnual;
        this.saldo = 0.0;
    }

    public String getNumeracao() {
        return numeracao;
    }

    public double getSaldo() {
        return saldo;
    }

    public double getTaxaJurosAnual() {
        return taxaJurosAnual;
    }

    public void depositar(double valor) throws OperacaoInvalidaException {
        if (valor > 0) {
            this.saldo = this.saldo + valor;
        } else {
            throw new OperacaoInvalidaException("Valor para deposito deve ser maior que 0");
        }

    }

    public void sacar(double valor) throws OperacaoInvalidaException {
        if (valor > 0 && saldo >= valor) {
            this.saldo = this.saldo - valor;
        } else {
            throw new OperacaoInvalidaException("Valor de saque deve ser menor que o saldo atual");
        }

    }

    public double calcularTarifaMensal() {

        double tarifaMensal = 0;
        if ((10) < (saldo * 0.1)) {
            tarifaMensal = 10;
        } else {
            tarifaMensal = this.saldo * 0.1;
        }
        return tarifaMensal;

    }

    public double calcularJurosMensal() {
        double taxaJurosMensal = 0;
        if (this.saldo < 0){
            taxaJurosMensal = 0;
        }else {
            taxaJurosMensal = saldo * ((taxaJurosAnual/12)/100);
        }

        return taxaJurosMensal;

    }

    public void aplicarAtualizacaoMensal() {
        this.saldo = this.saldo - calcularTarifaMensal() + calcularJurosMensal();

    }
}

