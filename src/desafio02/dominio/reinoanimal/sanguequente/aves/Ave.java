package desafio02.dominio.reinoanimal.sanguequente.aves;

import desafio02.dominio.reinoanimal.Animal;

public class Ave extends Animal {

    private String altura;
    private String peso;
    private String corDasPena;

    public Ave() {
    }

    @Override
    public void locomocao() {
        System.out.println("* Locomovem-se em sua grande maioria - Voando");
    }

    @Override
    public void tipoAlimentacao() {
        System.out.println("* Alimentam-se em geral de - Sementes");
    }

    @Override
    public void somEmitido() {
        System.out.println("* Podem comunicar-se atraves de sinais sonoros");
    }

    @Override
    public void visaoGeral(){
        System.out.println("AS AVES");
        locomocao();
        tipoAlimentacao();
        somEmitido();
        System.out.println("...............................");
    }

    public String getAltura() {
        return altura;
    }

    public void setAltura(String altura) {
        this.altura = altura;
    }

    public String getPeso() {
        return peso;
    }

    public void setPeso(String peso) {
        this.peso = peso;
    }

    public String getCorDasPena() {
        return corDasPena;
    }

    public void setCorDasPena(String corDasPena) {
        this.corDasPena = corDasPena;
    }

}
