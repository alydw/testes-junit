package usuario;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MultaTest {

    Multa multa;
    @Before
    public void setConfig(){
        System.out.println("Inicializando teste");
        this.multa = new Multa();
        this.multa.valorMultaPorDia(3.50);
    }

    @After
    public void setFinal(){
        System.out.println("O valor da multa vai ser: " + multa.valorFinalMulta());
    }

    @Test
    public void multaPorDia(){
        this.multa.diasDeAtraso(3);
        Assert.assertEquals(10.5, multa.getValorAPagar(), 0.0);
    }

    @Test
    public void multaMaisDeUmLivro(){
        this.multa.livrosEmAtraso(4);
        this.multa.diasDeAtraso(2);
        Assert.assertEquals(28.0, multa.getValorVariosLivros(), 0.0);
    }

    @Test
    public void multaIsenta(){
        this.multa.diasDeAtraso(0);
        Assert.assertEquals(0, multa.getValorAPagar(), 0.0);
    }
}
