package debitoCredito;

public class Caixa {
    double credito;
    double debito;
    double saldo = 1000;
    public Caixa() {
        this.credito = credito;
        this.debito = debito;
        this.saldo = saldo;
    }

    public double selecionaCredito() {
        saldo= saldo+credito;
        return  credito;
    }

    public double selecionaDebito(){
        saldo = saldo-debito;
        return debito;
    }
}
