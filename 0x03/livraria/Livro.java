package livraria;

import livraria.exceptions.AutorInvalidoException;
import livraria.exceptions.LivroInvalidoException;

public class Livro {
    private String titulo;
    private String autor;
    private double preco;
    public Livro(String titulo, String autor, double preco) throws AutorInvalidoException, LivroInvalidoException{
        if (autor.contains(" ")) {
            this.autor = autor;

        } else {
            throw new LivroInvalidoException("Nome de autor invalido");

        }
        if (preco == 0) {
            throw new AutorInvalidoException("Preco de livro invalido");
        } else {
            this.preco = preco;
        }

        if (titulo.length() >= 3) {
            this.titulo = titulo;

        } else {
             throw new  AutorInvalidoException("Titulo de livro invalido");
        }
    }
        public String getTitulo() {
            return titulo;
        }

        public void setTitulo(String titulo) {
            this.titulo = titulo;
        }

        public String getAutor() {
            return autor;
        }

        public void setAutor(String autor) {
            this.autor = autor;
        }

        public double getPreco() {
            return preco;
        }

        public void setPreco(double preco){
            this.preco = preco;
        }

}
