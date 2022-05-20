

import java.util.ArrayList;
import java.util.List;

public class Celular {

    private List<Contato> contatos = new ArrayList<>();

    public int obterPosicaoContato(String nome){
        for (int i = 0; i < contatos.size(); i++) {
            if (contatos.get(i).getNome().equals(nome)){
                return i;
            }
        }
        return -1;

    }

    public void adicionarContato(Contato contato) throws IllegalAccessException {

        if (obterPosicaoContato(contato.getNome()) == -1){
            contatos.add(contato);
        }else {
            throw new IllegalAccessException("Nao foi possivel adicionar contato. Contato jah existente com esse nome.");
        }

    }

    public void atualizarContato(Contato contatoAntigo, Contato novoContato){

        if (obterPosicaoContato(contatoAntigo.getNome()) ==  -1){
            throw new IllegalArgumentException("Nao foi possivel modificar contato. Contato nao existe");


        }else if (obterPosicaoContato(novoContato.getNome()) != -1 && obterPosicaoContato(contatoAntigo.getNome()) != obterPosicaoContato(novoContato.getNome())){
            throw new IllegalArgumentException("Nao foi possivel modificar contato. Contato jah existente com esse nome");
        }else {
            contatos.set(obterPosicaoContato(contatoAntigo.getNome()), novoContato);

        }

    }

    public void removerContato(Contato contato){
        if (obterPosicaoContato(contato.getNome()) != -1){
            contatos.remove(obterPosicaoContato(contato.getNome()));

        }else {

            throw new IllegalArgumentException("Nao foi possivel remover contato. Contato nao existe");
        }
    }

    public void listarContatos(){

        for (Contato x: contatos) {
            System.out.println(x.getNome() + " -> " + x.getNumero() + " (" + x.getTipo() + ")");

        }
    }

}
