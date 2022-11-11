package desafio02.dominio;

public class Ave extends Animal{
    private String corDasPena;

    public void fazerNinho(){
        System.out.println("Fazendo um ninho");
    }

    @Override
    public void locomover() {
        System.out.println("Voando");
    }

    @Override
    public void alimentar() {
        System.out.println("Sementes");
    }

    @Override
    public void emitirSom() {
        System.out.println("Som de ave");
    }

    public String getCorDasPena() {
        return corDasPena;
    }

    public void setCorDasPena(String corDasPena) {
        this.corDasPena = corDasPena;
    }

    @Override
    public String toString() {
        return "Ave{" +
                "corDasPena='" + corDasPena + '\'' +
                ", peso=" + peso +
                ", idade=" + idade +
                ", membros=" + membros +
                '}';
    }
}
