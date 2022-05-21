package usuario;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ReservaTest {

    Reserva reserva;
    @Before
    public void setConfig(){
        this.reserva = new Reserva();
    }

    @Test
    public void reservaSeExemplarDisponivel(){
        this.reserva.insereLivro(2);
        Assert.assertTrue(reserva.realizaReserva());
    }

    @Test
    public void reservaNegadaPorExemplarIndisponivel(){
        this.reserva.insereLivro(0);
        Assert.assertFalse(reserva.reservaIndisponivel());
    }

    @Test
    public void reservaNegadaPorExemplarEmEsprestimo(){
        this.reserva.insereLivro(3);
        reserva.retiraLivro(3);
        Assert.assertEquals( 0,reserva.getLivroIndisponivel(), 0);
    }
}
