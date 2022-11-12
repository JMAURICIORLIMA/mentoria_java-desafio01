package desafio02.dominio.reinoanimal.sanguequente.mamiferos;

public class Urso extends Mamifero {
    private String tempoDeVida;
    private boolean hibernar;

    public Urso() {
    }

    @Override
    public void locomocao() {
        System.out.println("* Locomovem-se andando ou correndo até mesmo com os dois pés.");
    }

    @Override
    public void tipoAlimentacao() {
        System.out.println("* Onívoros - alimentam-se tanto de animais quanto de plantas e algas.");
    }

    @Override
    public void somEmitido() {
        System.out.println("* Sons emitidos - bramar, bramir, rugir");
    }

    @Override
    public void visaoGeral() {
        System.out.println("MAMIFERO - URSO");
        System.out.println(getTempoDeVida());
        locomocao();
        tipoAlimentacao();
        somEmitido();
        System.out.println(getRevertimentoCorporal());
        System.out.println("* Dormindo: " + isHibernar());
        System.out.println("...............................");
    }

    public String getTempoDeVida() {
        return tempoDeVida;
    }

    public void setTempoDeVida(String tempoDeVida) {
        this.tempoDeVida = tempoDeVida;
    }

    public boolean isHibernar() {
        return hibernar;
    }

    public void setHibernar(boolean hibernar) {
        this.hibernar = hibernar;
    }
}
