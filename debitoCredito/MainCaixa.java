package debitoCredito;

import java.util.Scanner;

public class MainCaixa {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Caixa c1 = new Caixa();
        System.out.println("Quantas operações você quer fazer?");
        int lancamentos = input.nextInt();

        for (int i = 1; i <= lancamentos; i++) {
            System.out.println("digite 1 para débito ou 2 para crédito");
            int opcao = input.nextInt();

            switch (opcao) {
                case 1:

                    System.out.println("digite o valor que deseja debitar");
                    c1.debito = input.nextDouble();
                    double valorDebito = c1.selecionaDebito();
                    System.out.println("O débito foi de  + " + valorDebito);
                    System.out.println(" seu saldo é de: " + c1.saldo);
                    break;
                case 2:
                    System.out.println("Digite o valor que deseja creditar");

                    c1.credito = input.nextDouble();

                    double valorCredito = c1.selecionaCredito();
                    System.out.println("Você creditou" + valorCredito);
                    System.out.println(" seu saldo é de: " + c1.saldo);
                    break;
                default:
                    System.out.println("Operação inválida, tente novamente com as instruçõe passadas");
                    System.out.println(" seu saldo é de: " + c1.saldo);
            }

        }
    }

}
