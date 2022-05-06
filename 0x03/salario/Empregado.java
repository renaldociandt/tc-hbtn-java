

public class Empregado {

    public double salarioFixo;
    public double valorBonus;

    public Empregado(double salarioFixo){

        this.salarioFixo = salarioFixo;

    }

    public double calcularBonus(Departamento departamento) {

        if (departamento.alcancouMeta()) {
            this.valorBonus =  salarioFixo * 0.1;
        }else {
            this.valorBonus = salarioFixo * 0;
        }
        return valorBonus;
    }

    public double calcularSalarioTotal(Departamento departamento) {

        return salarioFixo + valorBonus;
    }

        public double getSalarioFixo(){

            return this.salarioFixo;

        }
    }
