package retangulo;

public class Retangulo {
    double ladoA;
    double ladoB;

    public Retangulo() {
        this.ladoA = ladoA;
        this.ladoB = ladoB;
    }

    public void alteraValorLados(double ladoA, double ladoB){
        this.ladoA = ladoA;
        this.ladoB = ladoB;
    }

    public void mostrarLados(){
        System.out.println("mostrar lado A  = " +  ladoA + " Lado B " + ladoB);
    }

    public  double calculoArea(){
        double total = 0;
        total = this.ladoA * this.ladoB;
        return total;
    }

    public double calcularPerimetro(){
        double total;
        total = 2 * (ladoA + ladoB);
        return total;
    }
}
