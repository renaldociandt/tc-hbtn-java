package livraria;

import exceptions.*;

public class Livro {
    public String titulo;
    public String autor;
    public double preco;
    public Livro(String titulo, String autor, double preco)throws AutorInvalidoException, LivroInvalidoException{
        this.setTitulo(titulo);
        this.setAutor(autor);
        this.setPreco(preco);

    }
        public String getTitulo() {
            return titulo;
        }

        public void setTitulo(String titulo) throws AutorInvalidoException {
            if (titulo.length() >= 3) {
                this.titulo = titulo;
            } else {
            throw new  AutorInvalidoException("Titulo de livro invalido");
            }
        }

        public String getAutor() {
            return autor;
        }

        public void setAutor(String autor) throws LivroInvalidoException {
        if (autor.contains(" ")) {
            this.autor = autor;
        } else {
                throw new LivroInvalidoException("Nome de autor invalido");
            }

        }
        public double getPreco(){
            return preco;
        }

        public void setPreco(double preco) throws AutorInvalidoException {
            if (preco == 0) {
                throw new AutorInvalidoException("Preco de livro invalido");
            } else {
                this.preco = preco;
            }
        }

}
