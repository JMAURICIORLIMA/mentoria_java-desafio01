package desafio01.dominio;

import java.util.Scanner;

public class Candidatos {
    private String nome;
    private String partido;
    private String sigla;
    private String numeroCandidato;

    Scanner sc = new Scanner(System.in);

    public void cadastroEleitor() {
        System.out.printf("%nNome do candidato: ");
        this.nome = sc.nextLine();
        System.out.print("Partido: ");
        this.partido = sc.nextLine();
        System.out.print("Sigla: ");
        this.sigla = sc.nextLine();
        System.out.print("Numero do candidato: ");
        this.numeroCandidato = sc.nextLine();

        informacoesCandidato();
    }

    public void informacoesCandidato() {
        System.out.printf("%n----------------------------------%n" +
                        "Candidato: %s" +
                        "%nPartido: %s " +
                        "%nSigla: %s" +
                        "%nNumero: %s %n",
                this.nome,
                this.partido,
                this.sigla,
                this.numeroCandidato);
    }

}
