
import java.util.*;

public class ListaTelefonica {

    HashMap<String, ArrayList<Telefone>> map;

    public ListaTelefonica() {
        this.map = new HashMap<>();
    }

    public void adicionarTelefone(String nome, Telefone telefone){
        ArrayList<Telefone> tel = new ArrayList<>();
        tel.add(telefone);
        if (map.containsKey(nome)) {
                map.get(nome).add(telefone);
        }else {
            map.put(nome, tel);
        }
    }

    public ArrayList<Telefone> buscar(String nome){
            return map.get(nome);
    }

}
