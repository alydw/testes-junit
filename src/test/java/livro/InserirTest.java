package livro;

import org.junit.Assert;
import org.junit.Test;

public class InserirTest {
    @Test
    public void inserirLivroTest () {
        Inserir inserir = new Inserir();
        inserir.inserirLivro(9);
        Assert.assertEquals(9, inserir.getQtdLivros(), 0);
    }

    @Test
    public void inserirMaisDeUmTest() {
        Inserir inserir = new Inserir();
        inserir.inserirLivro(2);
        inserir.inserirLivro(2);
        Assert.assertEquals(4, inserir.getQtdLivros(), 0);
    }

    @Test
    public void inserirZeroLivros() {
        Inserir inserir = new Inserir();

        Assert.assertEquals("valor invalido", inserir.inserirLivro(0) );
    }





}
