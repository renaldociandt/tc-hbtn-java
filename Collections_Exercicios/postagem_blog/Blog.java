

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

    public TreeSet<Post> obterPostsPorAutor(Autor autor){
        TreeSet<Post> map = new TreeSet<>();
        for (Post cont: posts) {
            if (Objects.equals(cont.autor.getNome(), autor.getNome())){
                map.add(cont);
            }

        }
        return map;
    }

    public HashSet<Autor> obterTodosAutores(){

        HashSet<Autor> autores = new HashSet<>();
        for (Post post : posts) {
            if (post.corpo != null) {
                autores.add(post.autor);
            }
        }
        return autores;
    }

    public TreeSet<Post> obterPostsPorCategoria(Categorias categorias) {
        TreeSet<Post> categoria = new TreeSet<>();
        for (Post cont : posts) {
            if (cont.categoria == categorias) {
                categoria.add(cont);
            }
        }
        return categoria;
    }

    public TreeMap<Categorias, Integer> obterContagemPorCategoria() {
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

    public HashMap<Autor, Set<Post>> obterTodosPostsPorAutor(){
        HashMap<Autor, Set<Post>> map = new HashMap<>();
        for(Post cont: posts){
            if (cont.autor == cont.getAutor()){
                map.put(cont.autor, obterPostsPorAutor(cont.autor));

            }
        }
        return map;
    }
}
