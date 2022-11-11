package desafio02.dominio;

public class Reptil extends Animal{
    private String corDaEscama;

    @Override
    public void locomover() {
        System.out.println("Rastejanto");
    }

    @Override
    public void alimentar() {
        System.out.println("Comendo substancias");
    }

    @Override
    public void emitirSom() {
        System.out.println("Som de reptil.");
    }

    public String getCorDaEscama() {
        return corDaEscama;
    }

    public void setCorDaEscama(String corDaEscama) {
        this.corDaEscama = corDaEscama;
    }
}
