package desafio01.principal;

import desafio01.dominio.Candidatos;
import desafio01.dominio.Votar;

public class Principal {
    public static void main(String[] args) {

        Candidatos c1 = new Candidatos();

        c1.cadastroEleitor();

        Candidatos c2 =  new Candidatos();

        c2.cadastroEleitor();


        Votar eleito1 = new Votar();
        eleito1.verificaTitulo();


    }
}
