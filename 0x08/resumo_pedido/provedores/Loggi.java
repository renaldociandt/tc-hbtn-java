package provedores;

public class Loggi implements ProvedorFrete {
    private double valorFrete;

    @Override
    public double calcularFrete(double peso, double valor) {
        if (peso > 50000) {
            valorFrete = (valor * 0.12);
        } else {
            valorFrete = (valor * 0.04);
        }
        return valorFrete;
    }

    public TipoProvedorFrete obterTipoProvedorFrete(){

        return TipoProvedorFrete.LOGGI;
    }
}
