package provedores;

public class JadLog implements ProvedorFrete{

    private double valorFrete;

    @Override
    public double calcularFrete(double peso, double valor) {
        if (peso > 2000) {
            valorFrete = (valor * (7.0/100));
        } else {
            valorFrete = (valor * (4.5/100));
        }
        return valorFrete;
    }

    public TipoProvedorFrete obterTipoProvedorFrete(){

        return TipoProvedorFrete.JADLOG;
    }
}
