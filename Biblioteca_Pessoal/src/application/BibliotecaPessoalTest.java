package application;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class BibliotecaPessoalTest {

    private Biblioteca biblioteca;

    @BeforeEach
    public void setup() {
        biblioteca = new Biblioteca();
    }

    @Test
    public void testAdicionarLivro() {
        Livro livro = new Livro("1234567890", "Java Programming", "John Doe");

        biblioteca.adicionarLivro(livro);

        Assertions.assertEquals(1, biblioteca.getLivros().size());
        Assertions.assertTrue(biblioteca.getLivros().contains(livro));
    }
}
