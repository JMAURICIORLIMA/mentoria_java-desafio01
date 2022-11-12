package desafio02.dominio.reinoanimal.sanguequente.aves;

public class Avestruz extends Ave {
    private String origem;

    public Avestruz() {
    }

    @Override
    public void somEmitido() {
        System.out.println("* Sons emitidos - grasnar, roncar, rugir");
    }

    @Override
    public void tipoAlimentacao() {
        System.out.println("* Onívoro. Nutre-se, portanto, de alimentos de origem animal e também de origem vegetal.\n" +
                "Gramíneas, sementes, raízes e pequenos animais, como lagartixas e insetos,\n" +
                "fazem parte da dieta desse animal.");
    }

    @Override
    public void locomocao() {
        System.out.println("* Apesar de não voarem, as avestruzes apresentam locomoção eficiente em terra." +
                "Elas são capazes de correr rapidamente, atingindo até 70 km/h. Suas pernas longas e com músculos" +
                "potentes propiciam essa grande capacidade de corrida.");
    }

    @Override
    public void visaoGeral() {
        System.out.println("AVE - AVESTRUZ");
        System.out.println("* Ave de origem: "+getOrigem());
        System.out.println(getAltura());
        System.out.println(getPeso());
        System.out.println(getCorDasPena());
        somEmitido();
        System.out.println("...............................");
    }

    public String getOrigem() {
        return origem;
    }

    public void setOrigem(String origem) {
        this.origem = origem;
    }

}
