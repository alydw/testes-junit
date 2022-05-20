package usuario;

public class Multa {

    private double valor_multa;
    private float dias_de_atraso;
    private float livros_em_atraso;

    public Multa() {
        this.valor_multa = 0;
        this.dias_de_atraso = 0;
        this.livros_em_atraso = 0;
    }

    public void valorMultaPorDia(double valor) {
        this.valor_multa += valor;
    }

    public double getValorMultaPorDia(){
        return this.valor_multa;
    }

    public void diasDeAtraso(int dias) {
        this.dias_de_atraso += dias;
    }

    public float getDias_de_atraso(){
        return this.dias_de_atraso;
    }

    public double getValorAPagar() {
       return this.getValorMultaPorDia() * this.getDias_de_atraso();
    }

    public void livrosEmAtraso(int qntd_livros) {
        this.livros_em_atraso += qntd_livros;
    }
    public float getLivros_em_atraso(){
        return this.livros_em_atraso;
    }

    public double getValorVariosLivros() {
        return this.getValorMultaPorDia() * this.getLivros_em_atraso() * this.getDias_de_atraso();
    }

    public double valorFinalMulta(){
        if (this.livros_em_atraso > 1){
            return this.getValorMultaPorDia() * this.getLivros_em_atraso() * this.getDias_de_atraso();
        }else{
            return this.getValorMultaPorDia() * this.getDias_de_atraso();
        }
    }
}
