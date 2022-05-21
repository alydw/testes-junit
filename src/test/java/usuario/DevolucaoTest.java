package usuario;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class DevolucaoTest {

    Devolucao devolucao;
    @Before
    public void setConfig(){
        this.devolucao = new Devolucao();
    }

    @Test
    public void devolucaoNaDataCorreta(){
        this.devolucao.diasParaDevolucao(15);
        this.devolucao.diasEntregues(12);
        Assert.assertTrue(devolucao.getDataEfetuada());
    }

    @Test
    public void devolucaoAposAData(){
        this.devolucao.diasParaDevolucao(20);
        devolucao.diasEntregues(22);
        Assert.assertFalse(devolucao.getDataEfetuada());
    }

    @Test
    public void dataDevolucaoRenovada(){
        this.devolucao.diasParaDevolucao(3);
        this.devolucao.diasAdicionados(10);
        Assert.assertEquals(13,devolucao.getDevolucaoRenovada(), 0.0);
    }
}
