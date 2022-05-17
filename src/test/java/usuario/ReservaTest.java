package usuario;

import org.junit.Assert;
import org.junit.Test;

public class ReservaTest {

    @Test
    public void reservaSeExemplarDisponivel(){
        Reserva reserva = new Reserva();
        reserva.insereLivro(2);
        Assert.assertTrue(reserva.realizaReserva());
    }

    @Test
    public void reservaNegadaPorExemplarIndisponivel(){
        Reserva reserva = new Reserva();
        reserva.insereLivro(0);
        Assert.assertFalse(reserva.reservaIndisponivel());
    }

    @Test
    public void reservaNegadaPorExemplarEmEsprestimo(){
        Reserva reserva = new Reserva();
        reserva.insereLivro(3);
        reserva.retiraLivro(3);
        Assert.assertEquals("Reserva não realizada, pois livro já se encontra em uso", 0,reserva.getLivroIndisponivel(), 0);
    }
}
