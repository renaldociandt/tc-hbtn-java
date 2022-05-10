

public class Quadrado extends Retangulo{

    private double lado;

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) throws IllegalAccessException {
        if (lado < 0){
            throw new IllegalAccessException("Lado deve ser maior ou igual a 0");
        }else {
            this.lado = lado;
        }
    }

    public String toString(){

        return "[Quadrado] " + String.format("%.2f", getLado());
    }
}
