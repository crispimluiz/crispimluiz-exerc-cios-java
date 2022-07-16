package retangulo;

import java.util.Scanner;

public class MainRetangulo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Retangulo r1 = new Retangulo();
        double ladoA = r1.ladoA;
        double ladoB = r1.ladoB;

        System.out.println("Coloque o valor do lado A");
        ladoA = input.nextDouble();
        System.out.println("Coloque o valor do lado B");
        ladoB = input.nextDouble();

        System.out.println("Valor de A = " + ladoA);
        System.out.println("Valor de B = " + ladoB);

        System.out.println("Deseja alterar valor dos lados: S/N");
        String usuario = input.next();

        if(usuario.equalsIgnoreCase("s")){
            System.out.println("Novo valor de lado A");
            ladoA = input.nextDouble();
            System.out.println("Novo valor de lado B");
            ladoB = input.nextDouble();
            r1.alteraValorLados(ladoA, ladoB);
        }else{
            r1.alteraValorLados(ladoA, ladoB);
        }

        //método para mostrar dados
        r1.mostrarLados();

        double calculo = r1.calculoArea();
        System.out.println("valor Calculo Área= " +  calculo);

        double perimetro = r1.calcularPerimetro();
        System.out.println("Calculo do perimetro = " +  perimetro);
    }
}
