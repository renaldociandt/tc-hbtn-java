package produtos;

public abstract class Produto {

    protected String titulo;
    protected int ano;
    protected String pais;
    protected Double precoBruto;

    public Produto(String titulo, int ano, String pais, Double precoBruto) {
        this.titulo = titulo;
        this.ano = ano;
        this.pais = pais;
        this.precoBruto = precoBruto;
    }

    public abstract double obterPrecoLiquido();


    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public Double getPrecoBruto() {
        return precoBruto;
    }

    public void setPrecoBruto(Double precoBruto) {
        this.precoBruto = precoBruto;
    }
}
