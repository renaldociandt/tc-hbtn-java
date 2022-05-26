

import java.util.*;
public class Blog {
    private ArrayList<Post> posts = new ArrayList<>();

    public void adicionarPostagem(Post post){
        posts.add(post);

    }

    public TreeSet<String> obterTodosAutores(){
        TreeSet<String> autores = new TreeSet<>();
        for (Post post : posts) {
            if (post.corpo != null) {
                autores.add(post.autor);

            }
        }
        return autores;
    }

    public TreeMap<String, Integer> obterContagemPorCategoria() {
        TreeMap<String, Integer> map = new TreeMap<>();
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
}
