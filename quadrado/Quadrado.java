package quadrado;

import java.util.Scanner;

public class Quadrado {
    double lado;

    public Quadrado() {
        this.lado = lado;
    }

    public void mudarValorLado(){
        Scanner input = new Scanner(System.in);
        System.out.println("Coloque um novo valor do lado: ");
        lado = input.nextDouble();
        System.out.println(lado);
    }

    public double retornarValorLado(){
        return lado;
    }

    public double calcularArea(){
        lado *=lado;
        return lado;
    }
}
