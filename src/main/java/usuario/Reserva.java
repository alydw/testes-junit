package usuario;

public class Reserva {

    private float qntd_livro;
    private float livros_emprestados;

    public Reserva() {
        this.qntd_livro = 0;
        this.livros_emprestados = 0;
    }

    public void insereLivro(int i) {
        this.qntd_livro += i;
    }

    public float getQntd_livro(){
        return this.qntd_livro;
    }

    public boolean realizaReserva(){
        if (this.getQntd_livro() >= 1){
            return true;
        }
        return false;
    }

    public boolean reservaIndisponivel() {
        if (this.getQntd_livro() <= 0){
            return false;
        }
        return true;
    }


    public void retiraLivro(int e) {
        this.livros_emprestados += e;
    }

    public float getLivros_emprestados(){
        return this.livros_emprestados;
    }


    public float getLivroIndisponivel() {
        return this.getQntd_livro() - this.getLivros_emprestados();
    }
}
