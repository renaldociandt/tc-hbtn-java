

public class Departamento {

    public double valorMeta;
    public double valorAtingidoMeta;
    public Departamento(double valorMeta, double valorAtingidoMeta){
        this.valorMeta = valorMeta;
        this.valorAtingidoMeta = valorAtingidoMeta;

    }

    public boolean alcancouMeta() {

        if (this.getValorAtingidoMeta() >= this.getValorMeta()) {
            return true;
        } else {

            return false;
        }
    }
        public double getValorMeta(){

            return valorMeta;
        }

        public double getValorAtingidoMeta(){

            return valorAtingidoMeta;

        }
    }

