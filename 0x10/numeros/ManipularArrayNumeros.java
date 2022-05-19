

import java.util.List;

public class ManipularArrayNumeros {


    public static int buscarPosicaoNumero(List<Integer> list, int numero){
        if (list.contains(numero)){
               return list.indexOf(numero);
            }
        return -1;
    }

    public static void adicionarNumero(List<Integer> list, int numero){
        if (buscarPosicaoNumero(list, numero) != -1){

            exception1();

        }else {
            list.add(numero);
        }


    }

    public static void removerNumero(List<Integer> list, int numero){
        if (buscarPosicaoNumero(list, numero) == -1){
            exception();

        }else {
            list.remove(buscarPosicaoNumero(list, numero));
        }


    }

    public static void substituirNumero(List<Integer> list, int numero1, int numero2){
        if (buscarPosicaoNumero(list, numero1) == -1){
                list.add(numero2);
            }else {
                list.set(buscarPosicaoNumero(list, numero1), numero2);
            }

    }

    public static void exception() {
        throw new IllegalArgumentException ("Numero nao encontrado na lista");

    }

    public static void exception1(){
        throw new IllegalArgumentException ("Numero jah contido na lista");
    }

}
