package usuario;

import org.junit.Assert;
import org.junit.Test;

public class DevolucaoTest {

    @Test
    public void devolucaoNaDataCorreta(){
        Devolucao devolucao = new Devolucao();
        devolucao.diasParaDevolucao(15);
        devolucao.diasEntregues(12);
        Assert.assertTrue(devolucao.getDataEfetuada());
    }

    @Test
    public void devolucaoAposAData(){
        Devolucao devolucao = new Devolucao();
        devolucao.diasParaDevolucao(20);
        devolucao.diasEntregues(22);
        Assert.assertFalse(devolucao.getDataEfetuada());
    }

    @Test
    public void dataDevolucaoRenovada(){
        Devolucao devolucao = new Devolucao();
        devolucao.diasParaDevolucao(3);
        devolucao.diasAdicionados(10);
        Assert.assertEquals(13,devolucao.getDevolucaoRenovada(), 0.0);
    }
}
