package provedores;

public class Sedex implements ProvedorFrete{
    public double valorFrete;

    @Override
    public  double calcularFrete(double peso, double valor){
        if (peso > 1000){
            valorFrete = (valor * 0.1);
        }else {
            valorFrete = (valor * 0.05);
        }
        return valorFrete;

    }
    @Override
    public TipoProvedorFrete obterTipoProvedorFrete(){
        return TipoProvedorFrete.SEDEX;
    }
}
