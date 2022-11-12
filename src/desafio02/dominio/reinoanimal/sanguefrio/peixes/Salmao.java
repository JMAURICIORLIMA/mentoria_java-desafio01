package desafio02.dominio.reinoanimal.sanguefrio.peixes;

public class Salmao extends Peixe {

    private String corDaCarne;

    public Salmao() {
    }

    @Override
    public void tipoAlimentacao() {
        System.out.println("* SALMÃO DA NARUREZA - Come crustáceos coloridos, por isso a cor rosa suave\n" +
                "* SALMÃO DE CATIVEIRO - Come ração e corantes sintéticos que dão à carne uma forte cor alaranjada");
    }

    @Override
    public void locomocao() {
        super.locomocao();
    }

    @Override
    public void somEmitido() {
        super.somEmitido();
    }

    @Override
    public void visaoGeral() {
        super.visaoGeral();
    }

    @Override
    public String getCorEscama() {
        return super.getCorEscama();
    }

    @Override
    public void setCorEscama(String corEscama) {
        super.setCorEscama(corEscama);
    }

    public String getCorDaCarne() {
        return corDaCarne;
    }

    public void setCorDaCarne(String corDaCarne) {
        this.corDaCarne = corDaCarne;
    }
}
