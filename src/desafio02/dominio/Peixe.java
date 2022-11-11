package desafio02.dominio;

public class Peixe extends Animal{
    private String corEscama;

    public void soltaBolha(){
        System.out.println("Blob, blob...");
    }

    @Override
    public void locomover() {
        System.out.println("Nadando");
    }

    @Override
    public void alimentar() {
        System.out.println("Alimento de peixe");
    }

    @Override
    public void emitirSom() {
        System.out.println("N/A");
    }

    public String getCorEscama() {
        return corEscama;
    }

    public void setCorEscama(String corEscama) {
        this.corEscama = corEscama;
    }
}
