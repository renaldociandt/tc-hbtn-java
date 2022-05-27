

import java.util.*;
public class Blog {
    private List<Post> posts = new ArrayList<Post>();

    public void adicionarPostagem(Post post){
        for (int i = 0; i < posts.size(); i++) {
            if (Objects.equals(posts.get(i).titulo, post.titulo)){
                throw new IllegalArgumentException("Postagem jah existente");
            }
        }
        posts.add(post);
    }

    public Set<Post> obterPostsPorAutor(Autor autor){
        TreeSet<Post> map = new TreeSet<>();
        for (Post cont: posts) {
            if (Objects.equals(cont.autor.getNome(), autor.getNome())){
                map.add(cont);
            }

        }
        return map;
    }

    public Set<Autor> obterTodosAutores(){

        TreeSet<Autor> autores = new TreeSet<>();
        for (Post post : posts) {
                autores.add(post.autor);
        }
        return autores;
    }

    public Set<Post> obterPostsPorCategoria(Categorias categorias) {
        TreeSet<Post> categoria = new TreeSet<>();
        for (Post cont : posts) {
            if (cont.categoria == categorias) {
                categoria.add(cont);
            }
        }
        return categoria;
    }

    public Map<Categorias, Integer> obterContagemPorCategoria() {
        TreeMap<Categorias, Integer> map = new TreeMap<>();
        for (int i = 0; i < posts.size(); i++) {
            Integer count = 0;

            for (Post post : posts) {
                if (Objects.equals(posts.get(i).categoria, post.categoria)) {
                    ++count;
                }
            }
            map.put(posts.get(i).categoria, count);
        }
        return map;
    }

    public Map<Categorias, Set<Post>> obterTodosPostsPorCategorias(){
        Map<Categorias, Set<Post>> map = new HashMap<>();
        for (Post cont: posts){
            if (cont.categoria == cont.getCategoria()){
                map.put(cont.categoria, obterPostsPorCategoria(cont.categoria));
            }
        }
        return map;
    }

    public Map<Autor, Set<Post>> obterTodosPostsPorAutor(){
        TreeMap<Autor, Set<Post>> map = new TreeMap<>();
        for(Post cont: posts){
            if (cont.autor == cont.getAutor()){
                map.put(cont.autor, obterPostsPorAutor(cont.autor));

            }
        }
        return map;
    }
}
