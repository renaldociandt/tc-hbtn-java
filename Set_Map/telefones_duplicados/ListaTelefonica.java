
import java.util.HashMap;
import java.util.HashSet;

public class ListaTelefonica {
    HashMap<String, HashSet<Telefone>> map;

    public ListaTelefonica() {
        this.map = new HashMap<String, HashSet<Telefone>>();
    }

    public HashSet<Telefone> adicionarTelefone(String nome, Telefone telefone){

        HashSet<Telefone> tel = new HashSet<>();
        tel.add(telefone);
        if (buscar(nome) != null) {
            if (map.containsKey(nome) && map.get(nome).contains(telefone)) {
                throw new IllegalArgumentException("Telefone jah existente para essa pessoa");
            }
            for (String chave : map.keySet()) {
                if (map.get(chave).contains(telefone)) {
                    throw new IllegalArgumentException("Telefone jah pertence a outra pessoa");
                }

            }map.get(nome).add(telefone);
        }else {
            map.put(nome, tel);
        }
        return map.get(nome);
    }

    public HashSet<Telefone> buscar(String nome) {
        if (map.containsKey(nome)) {
            return map.get(nome);
        }
        return null;
    }
}
