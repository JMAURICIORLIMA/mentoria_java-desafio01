package desafio02.teste;

import desafio02.dominio.reinoanimal.sanguefrio.peixes.Salmao;
import desafio02.dominio.reinoanimal.sanguefrio.repteis.Crocodilo;
import desafio02.dominio.reinoanimal.sanguequente.aves.Ave;
import desafio02.dominio.reinoanimal.sanguequente.aves.Avestruz;
import desafio02.dominio.reinoanimal.sanguequente.mamiferos.Mamifero;
import desafio02.dominio.reinoanimal.sanguefrio.peixes.Peixe;
import desafio02.dominio.reinoanimal.sanguefrio.repteis.Reptil;
import desafio02.dominio.reinoanimal.sanguequente.mamiferos.Urso;

public class AnimalTeste {
    public static void main(String[] args) {
        Ave ave = new Ave();
        Avestruz avestruz = new Avestruz();

        Mamifero mamifero = new Mamifero();
        Urso urso = new Urso();

        Peixe peixe = new Peixe();
        Salmao salmao = new Salmao();

        Reptil reptil = new Reptil();
        Crocodilo crocodilo = new Crocodilo();


        mamifero.visaoGeral();

        urso.setTempoDeVida("* Tempo médio de vida entre 25 a 40 anos");
        urso.setRevertimentoCorporal("* Revestimento corporal - pelos curtos");
        urso.setHibernar(true);
        urso.visaoGeral();


        ave.visaoGeral();

        avestruz.setPeso("Peso médio: 150kg");
        avestruz.setOrigem("Africana");
        avestruz.setAltura("Altura média de 3m");
        avestruz.setCorDasPena("Cor das penas - a coloração preta é predominante na grande maioria dos machos, apresentando penas\n" +
                "brancas na asas e na cauda. Já as fêmeas apresentam a coloração marrom. A cabeça do avestruz é coberta\n" +
                "com pequenas plumas e suas pernas são desprovidas de penas.");
        avestruz.visaoGeral();


        peixe.visaoGeral();

        salmao.setCorEscama("* Cor das escamas - braco de pigmento vermelho");
        salmao.setCorDaCarne("* Cor da carne - avermelhada");
        salmao.visaoGeral();


        reptil.visaoGeral();

        crocodilo.setCorDaEscama("* Cor das escamas - tonalidade marrom-oliva");
        crocodilo.setPretenceAFamiliaCrocodylidae(true);
        crocodilo.visaoGeral();

    }
}
