

import java.util.TreeMap;

public class AnalisadorFrase {
    public static TreeMap<String, Integer> contagemPalavras(String palavra){
        TreeMap<String, Integer> map = new TreeMap<>();

        String textoFormatar = palavra.replaceAll("[?.!]", "");
        String[] textoFormatado = textoFormatar.toLowerCase().split(" ");

        for (String texto : textoFormatado) {
            Integer times = 0;
            for (String value : textoFormatado) {
                if (texto.equals(value)) {
                    times++;
                }
            }
            if (!map.containsKey(texto)) {
                map.put(texto, times);
            }
        }
        return map;
    }

}
