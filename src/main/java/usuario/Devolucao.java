package usuario;

public class Devolucao {

    private float dia_devolucao;
    private float dia_devolvido;

    public Devolucao() {
        this.dia_devolucao = 0;
        this.dia_devolvido = 0;
    }

    public void diasParaDevolucao(int i) {
        this.dia_devolucao += i;
    }

    public float getDia_devolucao(){
        return this.dia_devolucao;
    }

    public void diasEntregues(int d) {
        this.dia_devolvido += d;
    }

    public float getDia_devolvido(){
        return this.dia_devolvido;
    }

    public boolean getDataEfetuada() {
        if (this.getDia_devolucao() >= this.getDia_devolvido()){
            return true;
        }
        return false;
    }

    public void diasAdicionados(int dias_adicionados) {
        this.dia_devolucao += dias_adicionados;
    }
    public double getDiasAdicionados(){
        return this.dia_devolucao;
    }

    public double getDevolucaoRenovada() {
        return this.getDiasAdicionados();
    }
}
