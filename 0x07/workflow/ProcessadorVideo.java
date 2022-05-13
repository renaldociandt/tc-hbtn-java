

import java.util.ArrayList;
import java.util.List;

public class ProcessadorVideo {

    public List<CanalNotificacao> canais = new ArrayList<>();

    public void registrarCanal(CanalNotificacao canais){
        this.canais.add(canais);

    }

    public void processar(Video video){
        Mensagem mensagem = new Mensagem();
        mensagem.setTexto(video.getArquivo() + " - " + video.getFormato());
        mensagem.setTipoMensagem(TipoMensagem.LOG);
        for(CanalNotificacao canal: canais){
            canal.notificar(mensagem);
        }
    }

}
