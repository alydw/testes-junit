package usuario;

import org.junit.Assert;
import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;

public class MultaTest {


    @Test
    public void multaPorDia(){
        Multa multa = new Multa();
        multa.valorMultaPorDia(3.50);
        multa.diasDeAtraso(3);
        Assert.assertEquals(10.5, multa.getValorAPagar(), 0.0);
    }

    @Test
    public void multaMaisDeUmLivro(){
        Multa multa = new Multa();
        multa.valorMultaPorDia(3.50);
        multa.livrosEmAtraso(4);
        multa.diasDeAtraso(2);
        Assert.assertEquals(28.0, multa.getValorVariosLivros(), 0.0);
    }

    @Test
    public void multaIsenta(){
        Multa multa = new Multa();
        multa.valorMultaPorDia(3.50);
        multa.diasDeAtraso(0);
        Assert.assertEquals(0, multa.getValorAPagar(), 0.0);
    }
}
