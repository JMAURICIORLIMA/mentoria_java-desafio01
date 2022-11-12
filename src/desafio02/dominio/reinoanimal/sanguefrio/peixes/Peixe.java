package desafio02.dominio.reinoanimal.sanguefrio.peixes;

import desafio02.dominio.reinoanimal.Animal;

public class Peixe extends Animal {
    private String corEscama = "* Escamas de diversas cores.";

    public Peixe() {
    }

    @Override
    public void locomocao() {
        System.out.println("* Locomovem-se - nadando");
    }

    @Override
    public void tipoAlimentacao() {
        System.out.println("* Cadeia alimentar - Peixes carnívoros: eles se alimentam principalmente de outros animais,\n" +
                "como crustáceos, anfíbios, insetos e peixes menores. Exemplos de espécies: Oscar, Acará e Betta;\n" +
                "Peixes herbívoros: esses peixes consomem alimentos de origem vegetal, como plantas, algas e outras.");
    }

    @Override
    public void somEmitido() {
        System.out.println("* Não emitem som, porém existem sensores laterais que podem captar movimentos na água.");
    }

    @Override
    public void visaoGeral(){
        System.out.println("OS PEIXES");
        locomocao();
        tipoAlimentacao();
        somEmitido();
        System.out.println(getCorEscama());
        System.out.println("...............................");
    }

    public String getCorEscama() {
        return corEscama;
    }

    public void setCorEscama(String corEscama) {
        this.corEscama = corEscama;
    }
}
