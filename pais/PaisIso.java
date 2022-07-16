package pais;

import java.util.*;

public class PaisIso {

    private String nome;

    private String codigoIso;

    private Double dimensao;

    private List<String> paisesVizinhos = new ArrayList<>(Arrays.asList("Paraguai", "Colômbia", "Argentina"));

    private Double populacao;

    public PaisIso() {
        this.nome = "Brasil";
        this.codigoIso = "BRA";
        this.dimensao = 8515767049.00;
        this.populacao = populacao;
    }

    //metodos
    public void paisVizinho(String numero){
        numero.contains("paraguari");
        System.out.println("Você acertou");
        for(String vizinho :paisesVizinhos){
            System.out.println(vizinho);
        }
    }

    public void densidadePopulacao(){
        double densidadeTotal = this.getPopulacao() / this.getDimensao();
        System.out.println("Densidade populacional " + densidadeTotal);
    }

    public void retornaInformacao(){
        System.out.println(getCodigoIso() + getNome() + getDimensao() + getPopulacao());
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCodigoIso() {
        return codigoIso;
    }

    public void setCodigoIso(String codigoIso) {
        this.codigoIso = codigoIso;
    }

    public Double getDimensao() {
        return dimensao;
    }

    public void setDimensao(Double dimensao) {
        this.dimensao = dimensao;
    }

    public Double getPopulacao() {
        return populacao;
    }

    public void setPopulacao(Double populacao) {
        this.populacao = populacao;
    }
}
