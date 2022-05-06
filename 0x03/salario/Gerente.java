package salario;

public class Gerente extends Empregado{

    public Gerente(double salarioFixo) {

        super(salarioFixo);
    }

    @Override
    public double calcularBonus(Departamento departamento){
      if (departamento.alcancouMeta()){
          valorBonus = salarioFixo * 0.2;
      }
      return valorBonus;

    }

}
