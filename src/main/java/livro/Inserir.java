package livro;

public class Inserir {
    private float qtdeLivros ;

    public Inserir() {
        this.qtdeLivros = 0;
    }

    public String inserirLivro(int i) {
        if(i == 0){
            return "valor invalido";
        }
        this.qtdeLivros += i;

        return  "valor valido";
    }

    public float getQtdLivros() {
        return qtdeLivros;
    }
}
