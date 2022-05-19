

import java.util.ArrayList;
import java.util.List;

public class ListaTodo {

    private List<Tarefa> tarefas;
    public ListaTodo() {
        this.tarefas = new ArrayList<Tarefa>();
    }

    public void adicionarTarefa(Tarefa tarefa) throws IllegalAccessException {

        for (Tarefa x: tarefas) {

            if (x.getIdentificador() == tarefa.getIdentificador()){
                throw new IllegalAccessException("Tarefa com identificador " + tarefa.getIdentificador() + " ja existente na lista" );
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
        for (int i = 0; i < tarefas.size(); i++){
            tarefas.get(i).setEstahFeita(false);

        }
    }

    public void fazerTodas(){
        for (int i = 0; i < tarefas.size(); i++){
            tarefas.get(i).setEstahFeita(true);

        }
    }

    public void listarTarefas(){
        for (int i = 0; i < tarefas.size(); i++) {

            if (tarefas.get(i).isEstahFeita()){
                System.out.println("[X] Id: " + (i + 1) + " - Descricao: " + tarefas.get(i).getDescricao());
            }else {
                System.out.println("[ ] Id: " + (i + 1) + " - Descricao: " + tarefas.get(i).getDescricao());;
            }

        }
    }

}
