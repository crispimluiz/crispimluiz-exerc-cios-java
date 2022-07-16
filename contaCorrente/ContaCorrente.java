package contaCorrente;

public class ContaCorrente {
    String agencia = "057";
    String numeroDaConta = "256";
    double saldo;
    double limiteDeCredito;
    double saldoMaisLimiteDeCredito;

    //contrutor
    public ContaCorrente() {
        this.agencia = agencia;
        this.numeroDaConta = numeroDaConta;
        this.saldo = saldo;
        this.limiteDeCredito = limiteDeCredito;
        this.agenciaNumeroConta = agenciaNumeroConta;
    }
    String agenciaNumeroConta = "";

    //metodo que concatena string agencia e numeroConta
    public void  agenciaNumeroConta(){
        agenciaNumeroConta = agencia + numeroDaConta;
    }
//metodo que retorna o saldo total da conta mais limite
    public void saldoTotalConta(double saldo, double limiteDeCredito){
        saldoMaisLimiteDeCredito = this.saldo + this.limiteDeCredito;
        System.out.println("Saldo mais Limite = " + saldoMaisLimiteDeCredito);
    }

}
