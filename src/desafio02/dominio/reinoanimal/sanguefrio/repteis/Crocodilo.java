package desafio02.dominio.reinoanimal.sanguefrio.repteis;

public class Crocodilo extends Reptil {

    private boolean pretenceAFamiliaCrocodylidae;

    public Crocodilo() {
    }

    @Override
    public void locomocao() {
        System.out.println("* Locomoção - ambiente aquatico (nadando)\n" +
                "* ambiente terrestre (rastejando)");
    }

    @Override
    public void tipoAlimentacao() {
        System.out.println("* São animais carnívoros.");
    }

    @Override
    public void somEmitido() {
        System.out.println("* Sons emitidos - bramir, rugir, chorar");
    }

    @Override
    public void visaoGeral() {
        System.out.println("RÉPTIL - CROCODILO");
        System.out.println("* Grupo dos crocodylidae "+ isPretenceAFamiliaCrocodylidae());
        super.visaoGeral();
    }

    @Override
    public String getCorDaEscama() {
        return super.getCorDaEscama();
    }

    @Override
    public void setCorDaEscama(String corDaEscama) {
        super.setCorDaEscama(corDaEscama);
    }

    public boolean isPretenceAFamiliaCrocodylidae() {
        return pretenceAFamiliaCrocodylidae;
    }

    public void setPretenceAFamiliaCrocodylidae(boolean pretenceAFamiliaCrocodylidae) {
        this.pretenceAFamiliaCrocodylidae = pretenceAFamiliaCrocodylidae;
    }
}
