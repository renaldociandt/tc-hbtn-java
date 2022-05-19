

import java.util.ArrayList;
import java.util.List;

public class ListaTodo {

    private List<Tarefa> tarefas;
    public ListaTodo() {
        this.tarefas = new ArrayList<Tarefa>();
    }

    public void adicionarTarefa(Tarefa tarefa) throws IllegalArgumentException {

        for (Tarefa x: tarefas) {

            if (x.getIdentificador() == tarefa.getIdentificador()){
                throw new IllegalArgumentException("Tarefa com identificador " + tarefa.getIdentificador() + " ja existente na lista" );
            }
        }
        tarefas.add(tarefa);
    }

    public  boolean marcarTarefaFeita(int identificador){
        boolean feito = false;
        for (Tarefa x: tarefas){
            if (x.getIdentificador() == identificador){
                x.setEstahFeita(true);
                feito = true;
            }
        }
        return feito;
    }

    public  boolean desfazerTarefa(int identificador){
        boolean feito = false;
        for (Tarefa x: tarefas){
            if (x.getIdentificador() == identificador){
                x.setEstahFeita(false);
                feito = true;
            }
        }
        return feito;
    }

    public void desfazerTodas(){
        for (Tarefa tarefa : tarefas) {
            tarefa.setEstahFeita(false);

        }
    }

    public void fazerTodas(){

        for (Tarefa tarefa : tarefas) {
            tarefa.setEstahFeita(true);

        }
    }

    public void listarTarefas(){
        for (int i = 0; i < tarefas.size(); i++) {

            if (tarefas.get(i).isEstahFeita()){
                System.out.println("[X]  Id: " + (i + 1) + " - Descricao: " + tarefas.get(i).getDescricao());
            }else {
                System.out.println("[ ]  Id: " + (i + 1) + " - Descricao: " + tarefas.get(i).getDescricao());;
            }

        }
    }

}
