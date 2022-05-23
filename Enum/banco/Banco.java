

import java.util.ArrayList;
import java.util.List;

public class Banco {

    private String nome;
    private ArrayList<Agencia> agencias;

    public Banco(String nome) {
        this.nome = nome;
        this.agencias = new ArrayList<Agencia>();

    }

    public Agencia buscarAgencia(String nomeDaAgencia){
        for (int i = 0; i < agencias.size(); i++) {
            if (agencias.get(i).getNome().equals(nomeDaAgencia)) {
                return agencias.get(i);
            }
        }
        return null;
    }

    public boolean adicionarAgencia(String nomeAgencia){
        if (buscarAgencia(nomeAgencia) == null){
            agencias.add(new Agencia(nomeAgencia));
            return true;
        }
        return false;
    }

    public boolean adicionarCliente(String nomeAgencia, String nomeCliente, double valorTransacao){
        if (buscarAgencia(nomeAgencia) != null && buscarAgencia(nomeAgencia).buscarCliente(nomeCliente) == null){
            buscarAgencia(nomeAgencia).novoCliente(nomeCliente, valorTransacao);
            return true;

        }
        return false;

    }

    public boolean adicionarTransacaoCliente(String nomeAgencia, String nomeCliente, double valorTransacao){

        if (buscarAgencia(nomeAgencia) != null && buscarAgencia(nomeAgencia).buscarCliente(nomeCliente) != null){
            buscarAgencia(nomeAgencia).adicionarTransacaoCliente(nomeCliente, valorTransacao);
            return true;
        }
        return false;

    }

    public boolean listarClientes(String nomeAgencia, boolean imprimeTransacao){
        if (buscarAgencia(nomeAgencia) != null) {
            if (!imprimeTransacao) {
                for (int i = 0; i < buscarAgencia(nomeAgencia).getClientes().size(); i++) {
                    System.out.println("Cliente: " + buscarAgencia(nomeAgencia).getClientes().get(i).getNome()  + " [" + (i + 1) + "]");
                }
            }else {

                for (int i = 0; i < buscarAgencia(nomeAgencia).getClientes().size(); i++) {
                    System.out.println("Cliente: " + buscarAgencia(nomeAgencia).getClientes().get(i).getNome()  + " [" + (i + 1) + "]");

                    for (int j = 0; j < buscarAgencia(nomeAgencia).getClientes().get(i).getTransacoes().size(); j++) {

                        System.out.println("  [" + (j + 1) + "]" + " valor " + buscarAgencia(nomeAgencia).getClientes().get(i).getTransacoes().get(j));
                    }
                }
            }
            return true;
        }else {
            return false;
        }
    }

}
