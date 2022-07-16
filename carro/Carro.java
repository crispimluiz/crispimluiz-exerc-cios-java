package carro;

public class Carro {
    int qtdPortas;
    String modelo;
    String marca;

    Boolean ligaCarro;
    double potencia;

    public Carro() {
        this.qtdPortas = qtdPortas;
        this.modelo = modelo;
        this.marca = marca;
        this.potencia = 2.0;
        this.ligaCarro = false;
    }

    public void ligarCarro(){
        this.ligaCarro = true;
        System.out.println("O carro está: " + ligaCarro);
    }

}
