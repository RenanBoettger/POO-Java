package application;
import java.util.ArrayList;
import java.io.Serializable;
import java.util.List;

class Biblioteca implements Serializable {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private ArrayList<Livro> livros;

    public Biblioteca() {
        livros = new ArrayList<>();
    }

    public void adicionarLivro(Livro livro) {
        livros.add(livro);
    }

    public List<Livro> getLivros() {
        return livros;
    }

    @Override
    public String toString() {
        return "Biblioteca{" +
                "livros=" + livros +
                '}';
    }
}