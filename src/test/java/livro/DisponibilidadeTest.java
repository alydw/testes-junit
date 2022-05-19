package livro;

import org.junit.Assert;
import org.junit.Test;

public class DisponibilidadeTest {

    @Test
    public void possuiDisponibilidade(){
        Disponibilidade disponibilidade = new Disponibilidade();
        disponibilidade.setQtdeLivros(10);
        disponibilidade.setQtdeLivrosEmprestados(4);

        Assert.assertEquals("possuimos livros, temos : 6", disponibilidade.verDiponibilidade());
    }
    @Test
    public void semDisponibilidade(){
        Disponibilidade disponibilidade = new Disponibilidade();
        disponibilidade.setQtdeLivros(10);
        disponibilidade.setQtdeLivrosEmprestados(10);
        Assert.assertEquals("todos os livros foram emprestados", disponibilidade.verDiponibilidade());
    }

    @Test
    public void tirandoAdicionando(){
        Disponibilidade disponibilidade = new Disponibilidade();
        disponibilidade.setQtdeLivros(10);
        disponibilidade.setQtdeLivros(10);
        disponibilidade.setQtdeLivros(2);
        Assert.assertEquals("possuimos livros, temos : 2", disponibilidade.verDiponibilidade());
    }
}
