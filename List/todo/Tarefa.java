

public class Tarefa {

    private String descricao;
    private boolean estahFeita;
    private int identificador;

    public Tarefa(){

    }

    public Tarefa(String descricao, int identificador) throws IllegalAccessException {
        this.modificarDescricao(descricao);
        this.identificador = identificador;
    }

    public void modificarDescricao(String descricao) throws IllegalAccessException {
        if (descricao != null && !descricao.isEmpty()){
            this.setDescricao(descricao);
        }else{
            throw new IllegalAccessException("Descricao de tarefa invalida");
        }

    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public boolean isEstahFeita() {
        return estahFeita;
    }

    public void setEstahFeita(boolean estahFeita) {
        this.estahFeita = estahFeita;
    }

    public int getIdentificador() {
        return identificador;
    }

    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }

}
