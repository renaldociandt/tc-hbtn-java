

import java.util.ArrayList;
import java.util.List;

public class Biblioteca <T extends Midia>{

    List<T> list = new ArrayList<>();

    public void adicionarMidia(T midia){
        list.add(midia);

    }

    public List<T> obterListaMidias(){

        return list;
    }

}
