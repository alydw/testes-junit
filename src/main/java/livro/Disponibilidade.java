package livro;



public class Disponibilidade {

    public  int qtdeLivros;
    public int qtdeLivrosEmprestados;


    public Disponibilidade () {
        this.qtdeLivros = 0;
        this.qtdeLivrosEmprestados = 0;
    }

    public int getQtdeLivros() {
        return qtdeLivros;
    }

    public void setQtdeLivros(int qtdeLivros) {
        this.qtdeLivros = qtdeLivros;
    }

    public int getQtdeLivrosEmprestados() {
        return qtdeLivrosEmprestados;
    }

    public void setQtdeLivrosEmprestados(int qtdeLivrosEmprestados) {
        this.qtdeLivrosEmprestados = qtdeLivrosEmprestados;
    }

    public String verDiponibilidade(){
          int disponibilidade = qtdeLivros - qtdeLivrosEmprestados;
          String mensagem = "";
          if(disponibilidade  > 0){
              mensagem = "possuimos livros, temos : "+ disponibilidade;

          }else {
              mensagem = "todos os livros foram emprestados";
          }

          return mensagem;
    }

}
