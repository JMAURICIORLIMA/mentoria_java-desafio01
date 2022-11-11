package desafio01.dominio;

import java.util.Scanner;

public class Eleitor {
    Scanner sc = new Scanner(System.in);
    private String titulo;
    private String sessao = "123";
    private boolean tituloValido = false;
    private boolean sessaoValida = false;
    private String eleitor = "";

    private Candidatos candidatos;

    private SomaVoto somaVoto;


    public void verificaTitulo() {
        do {

            System.out.print("Informe seu título: ");
            this.titulo = sc.nextLine();
            if (titulo.length() != 12) {
                System.out.print("Número inválido ");
            } else {
                System.out.println("Título válido... ");
                tituloValido = true;
                verificaSessao();
            }

            System.out.println("Caso deseje sair, pressione " + 2 + "");
            eleitor = sc.nextLine();

        } while (!eleitor.equals("2"));
    }

    public void verificaSessao() {

        do {

            System.out.print("Informe a sessão: ");
            sessao = sc.next();
            if (!sessao.equals("123")) {
                System.out.println("Dirija-se a outra sessão.\n" +
                        "Sessão informada não conrresponde a sessão presente.\n");
            } else {
                System.out.println("Sessão válida. Dirija-se a urna.");
                sessaoValida = true;
            }

            System.out.println("Digite "+2+" para finalizar");
            eleitor = sc.nextLine();

        } while (eleitor.equals("2"));

    }


//    System.out.print("Candidato \n" +
//                    "-> ");
//            somaVoto.somaDeVotos();
//            System.out.println(somaVoto);
//
//            eleitor = sc.next();
//            switch (eleitor) {
//                case "1":
//                    verificaTitulo();
//                    break;
//                case "2":
//                    System.out.println("Finaliza seção");
//                    break;
//                default:
//                    System.out.println("Opção inválida... ");
//                    break;
//            }}

}
