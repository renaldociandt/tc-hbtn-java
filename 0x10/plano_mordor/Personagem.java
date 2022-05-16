

import comida.*;
import humor.*;

public class Personagem {
    private int pontosDeFelicidade;
    public String obterHumorAtual(){
        String humorpersonagem;

        if (pontosDeFelicidade < -5){
            humor.Humor humor = new humor.Irritado();
            humorpersonagem = humor.getClass().getSimpleName();
        } else if (pontosDeFelicidade <= 0){
            humor.Humor humor = new humor.Triste();
            humorpersonagem = humor.getClass().getSimpleName();
        }else if (pontosDeFelicidade <= 15){
            humor.Humor humor = new humor.Feliz();
            humorpersonagem = humor.getClass().getSimpleName();
        }else {
            humor.Humor humor = new humor.MuitoFeliz();
            humorpersonagem = humor.getClass().getSimpleName();
        }
        return humorpersonagem;


    }

    public void comer(comida.Comida[] comida){
        for (comida.Comida comer: comida){
            this.setPontosDeFelicidade(pontosDeFelicidade + comer.getPontosDeFelicidade());

        }
    }

    public int getPontosDeFelicidade() {
        return pontosDeFelicidade;
    }

    public void setPontosDeFelicidade(int pontosDeFelicidade) {
        this.pontosDeFelicidade = pontosDeFelicidade;
        obterHumorAtual();
    }

    public String toString(){
        return getPontosDeFelicidade() + " - " +obterHumorAtual();
    }
}
