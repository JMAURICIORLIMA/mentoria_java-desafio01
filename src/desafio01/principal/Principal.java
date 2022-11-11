package desafio01.principal;

import desafio01.dominio.Candidatos;
import desafio01.dominio.Eleitor;
import desafio01.dominio.SomaVoto;

public class Principal {
    public static void main(String[] args) {

        Candidatos c1 = new Candidatos();

        c1.cadastroEleitor();

        Candidatos c2 =  new Candidatos();

        c2.cadastroEleitor();


        Eleitor eleitor = new Eleitor();
        eleitor.verificaTitulo();

    }
}
