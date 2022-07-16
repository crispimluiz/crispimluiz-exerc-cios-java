package quadrado;

import java.util.Scanner;

public class MainQuadrado {
    public static void main(String[] args) {
        Quadrado q = new Quadrado();

        Scanner input = new Scanner(System.in);

        System.out.println("Qual o valor do lado? = ");
        q.lado = input.nextDouble();

        //System.out.println(q.lado);

        System.out.println("Deseja mudar o lado ? = S/N");
        String usuario = input.next();
        if(usuario.equalsIgnoreCase("s")){
            q.mudarValorLado();
        } else{
            System.out.println("Agradeço a preferencia");
        }

        System.out.println("Valor retornado: " + q.retornarValorLado());

        System.out.println("Valor da área: " + q.calcularArea());
    }
}
