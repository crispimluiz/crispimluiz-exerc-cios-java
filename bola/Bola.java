package bola;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Bola {
    double circuferencia;
    String cor;
    String marca;
    double velocidade;
    String material;

    public Bola() {
        this.circuferencia = circuferencia;
        this.cor = "branca";
        this.marca = marca;
        this.velocidade = velocidade;
        this.material = material;
    }

    public void mostraCor(String cor){
        System.out.println(this.cor);
    }

    public void trocaCor(){
        //System.out.println(cor);
        Scanner input = new Scanner(System.in);
        System.out.println("Coloque a cor");
        cor=input.next();
        System.out.println("A cor da sua bola agora é " + cor);
    }
}
