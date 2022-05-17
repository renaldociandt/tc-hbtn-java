

public class InteiroPositivo {

    public int valor;

    public InteiroPositivo(Integer valor) {
        this.valor = valor;
    }

    public InteiroPositivo(String valor) {

        if (Integer.parseInt(valor) > 0){
            this.setValor(Integer.parseInt(valor));

        }else {
            exception();
        }

    }

    public boolean ehPrimo(){
        int count = 0;
        for (int x = 1; x <= valor; x++) {
            if (valor % x == 0){
                count += 1;
            }
        }
        if (count == 2){
            return true;
        }else {
            return false;
        }
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        if (valor > 0){
            this.valor = valor;

        }else {
            exception();
        }

    }

    public void exception(){
        throw new IllegalArgumentException ("Valor nao eh um valor inteiro positivo");
    }

}
