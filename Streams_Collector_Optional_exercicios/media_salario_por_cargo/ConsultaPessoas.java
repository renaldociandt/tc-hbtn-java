package media_salario_por_cargo;

import java.util.*;
import java.util.stream.Collectors;

public class ConsultaPessoas {

    public static TreeMap<String, TreeSet<Pessoa>> obterPessoasAgrupadasPorCargoEmOrdemReversa(List<Pessoa> pessoaList){
        return pessoaList.stream().collect(Collectors.groupingBy(Pessoa::getCargo, () -> new TreeMap<>(Comparator.reverseOrder()),Collectors.toCollection(TreeSet::new)));

    }

    public static Map<String, Long> obterContagemPessoasPorCargo(List<Pessoa> pessoaList){
        return pessoaList.stream().collect(Collectors.groupingBy(Pessoa::getCargo, Collectors.counting()));

    }

    public static Map<String, Map<Integer, Long>> obterContagemPessoasPorCargoEIdade(List<Pessoa> pessoaList){

        return pessoaList.stream().collect(Collectors.groupingBy(Pessoa::getCargo, Collectors.groupingBy(Pessoa::getIdade,Collectors.counting())));

    }

    public static Map<String, Double> obterMediaSalarioPorCargo(List<Pessoa> pessoaList){

        return pessoaList.stream().collect(Collectors.groupingBy(Pessoa::getCargo ,Collectors.averagingDouble(Pessoa::getSalario)));

    }
}
