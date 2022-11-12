package desafio02.dominio.reinoanimal.sanguefrio.repteis;

import desafio02.dominio.reinoanimal.Animal;

public class Reptil extends Animal {
    private String corDaEscama;

    public Reptil() {
    }

    @Override
    public void locomocao() {
        System.out.println("* Locomoção - uma das características mais comuns dos répteis é a locomoção por meio\n" +
                "do rastejamento, roçando o ventre no solo.");
    }

    @Override
    public void tipoAlimentacao() {
        System.out.println("* Alimentação - Alguns se alimentam de insetos, outros são vegetarianos e se alimentam\n" +
                "de flores. Tem os que comem ovos, peixes e outros animais, há também os que comem algas e sementes.\n" +
                "Ou seja, cada espécie têm a sua própria alimentação e ela varia de acordo com o habitat em que vive.");
    }

    @Override
    public void somEmitido() {
        System.out.println("* Alguns dos sons emitidos pelos répteis - ex:(corcodilo) bramir, rugir, chorar");

    }
    @Override
    public void visaoGeral() {
        System.out.println("OS RÉPTEIS");
        locomocao();
        tipoAlimentacao();
        somEmitido();
        System.out.println("...............................");
    }
    public String getCorDaEscama() {
        return corDaEscama;
    }

    public void setCorDaEscama(String corDaEscama) {
        this.corDaEscama = corDaEscama;
    }
}
