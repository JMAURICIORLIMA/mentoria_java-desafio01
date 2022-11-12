package desafio02.dominio.reinoanimal.sanguequente.mamiferos;

import desafio02.dominio.reinoanimal.Animal;

public class Mamifero extends Animal {
    private String revertimentoCorporal = "* Revestimento corporal - pelos, pele, escamas";

    public Mamifero() {
    }

    @Override
    public void locomocao() {
        System.out.println("* Locomovem-se - De forma geral através dos membros, sendo: (quadrúpedes ou bipedes)\n" +
                "com excessão do morcego, que locomove-se voando.");
    }

    @Override
    public void tipoAlimentacao() {
        System.out.println("* Alimentam-se - Mamando");
    }

    @Override
    public void somEmitido() {
        System.out.println("* Podem comunicar-se atraves de sinais sonoros");
    }

    @Override
    public void visaoGeral(){
        System.out.println("OS MAMIFEROS");
        locomocao();
        tipoAlimentacao();
        somEmitido();
        System.out.println(getRevertimentoCorporal());
        System.out.println("...............................");
    }

    public String getCor() {
        return revertimentoCorporal;
    }

    public void setCor(String cor) {
        this.revertimentoCorporal = cor;
    }

    public String getRevertimentoCorporal() {
        return revertimentoCorporal;
    }

    public void setRevertimentoCorporal(String revertimentoCorporal) {
        this.revertimentoCorporal = revertimentoCorporal;
    }
}
