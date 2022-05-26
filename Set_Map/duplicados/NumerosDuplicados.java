package duplicados;

import java.util.*;
public class NumerosDuplicados {


    public static TreeSet<Integer> buscar(int[] numeros) {
        TreeSet<Integer> mapSet = new TreeSet<>();
        HashSet<Integer> mapHash = new HashSet<>();


        for (Integer x : numeros) {
            if (mapHash.contains(x)) {
                mapSet.add(x);

            } else {
                mapHash.add(x);
            }
        }
        return mapSet;
    }
}
