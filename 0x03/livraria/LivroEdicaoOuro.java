package livraria;

import livraria.exceptions.AutorInvalidoException;
import livraria.exceptions.LivroInvalidoException;

public class LivroEdicaoOuro extends Livro {

    public LivroEdicaoOuro(String titulo, String autor, double preco) throws LivroInvalidoException, AutorInvalidoException {
        super(titulo, autor, preco);
    }

    @Override
    public void setPreco(double preco) {
        if (preco != 0)
            this.setPreco(this.getPreco() + this.getPreco() * 0.3);
        }
}