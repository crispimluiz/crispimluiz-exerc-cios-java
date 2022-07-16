package pais;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class MainPais {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        PaisIso pais = new PaisIso();

        System.out.println("Qual a quatidade da população do Brasil");
        pais.setPopulacao(input.nextDouble()) ;

        System.out.println("O Brasil é visinho do Paraguai");
        System.out.println("Se sim digite 1 e 2 para não");
        String chile= input.next();
        pais.paisVizinho("paraguari");
        //pais.retornaInformacao();

        pais.densidadePopulacao();
    }
}