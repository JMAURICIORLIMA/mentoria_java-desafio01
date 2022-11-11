package desafio02.dominio;

public abstract class Animal {
    protected float peso;
    protected short idade;
    protected byte membros;

    public abstract void locomover();

    public abstract void alimentar();

    public abstract void emitirSom();

}
