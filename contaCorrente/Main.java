package contaCorrente;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ContaCorrente conta = new ContaCorrente();

        System.out.println("Digite valor saldo = ");
        conta.saldo = input.nextDouble();

        System.out.println("Digite valor limite = ");
        conta.limiteDeCredito = input.nextDouble();

        conta.saldoTotalConta(conta.saldo, conta.limiteDeCredito);

    }
}