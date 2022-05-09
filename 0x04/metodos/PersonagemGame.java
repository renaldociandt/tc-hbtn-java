
public class PersonagemGame {
    private int saudeAtual;
    private String nome;

    public void tomarDano(int quantidadeDeDano){
        while (this.getSaudeAtual() > 0) {
            this.setSaudeAtual(this.getSaudeAtual() - quantidadeDeDano);
        }
    }

    public void receberCura(int quantidadeDeCura){
        while (this.getSaudeAtual() < 100){
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
