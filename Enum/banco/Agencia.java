

import java.util.ArrayList;
import java.util.List;

public class Agencia {

    private String nome;
    private List<Cliente> clientes;

    public Agencia(String nome) {
        this.nome = nome;
        this.clientes = new ArrayList<Cliente>();

    }

    public Cliente buscarCliente(String nome){

        for (Cliente value : clientes) {
            if (value.getNome().equals(nome)) {
                return value;
            }
        }
        return null;
    }

    public boolean novoCliente(String nomeDoCliente, double valorTransacao){
        if (buscarCliente(nomeDoCliente) == null){
            clientes.add(new Cliente(nomeDoCliente, valorTransacao));
            return true;
        }else {
            return false;
        }
    }

    public boolean adicionarTransacaoCliente(String nome, double valorTransacao){

        if (buscarCliente(nome) != null){
            buscarCliente(nome).adicionarTransacao( valorTransacao);
            return true;
        }
        return false;
    }

    public String getNome() {
        return nome;
    }

    public List<Cliente> getClientes() {
        return clientes;
    }
}
