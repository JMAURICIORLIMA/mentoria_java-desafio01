package desafio02.teste;

import desafio02.dominio.Ave;
import desafio02.dominio.Mamifero;
import desafio02.dominio.Peixe;
import desafio02.dominio.Reptil;

public class AnimalTeste {
    public static void main(String[] args) {
        Ave ave = new Ave();
        Mamifero mamifero = new Mamifero();
        Peixe peixe = new Peixe();
        Reptil reptil = new Reptil();

        String impriveAve = ave.toString();
        System.out.println(impriveAve);
    }
}
