
public class PersonagemGame {
    private int saudeAtual;
    private String nome;

    public void tomarDano(int quantidadeDeDano){
        if (this.getSaudeAtual() - quantidadeDeDano < 0) {
            this.setSaudeAtual(0);
        }else {
            this.setSaudeAtual(this.getSaudeAtual() - quantidadeDeDano);
        }
    }

    public void receberCura(int quantidadeDeCura){
        if ((this.getSaudeAtual() + quantidadeDeCura) > 100){
            this.setSaudeAtual(100);
        }else {
            this.setSaudeAtual(this.getSaudeAtual() + quantidadeDeCura);
        }
    }

    public int getSaudeAtual() {
        return saudeAtual;
    }

    public void setSaudeAtual(int saudeAtual) {
        this.saudeAtual = saudeAtual;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
