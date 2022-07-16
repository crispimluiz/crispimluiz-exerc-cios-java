package teste;

import java.util.Scanner;

public class MainTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Soma soma = new Soma();
        int num1;
        int num2;

        System.out.println("Coloque valor de num1");
        num1 = input.nextInt();

        System.out.println("Coloque valor de num1");
        num2 = input.nextInt();

        soma.somar(num1, num2);
        System.out.println("Resultado soma: " + soma.somar(num1, num2));

        System.out.println("Resultado soma: " + soma.soma);


    }
}
