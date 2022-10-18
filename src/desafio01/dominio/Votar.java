package desafio01.dominio;

import java.util.Scanner;

public class Votar {
    Scanner sc = new Scanner(System.in);
    private String titulo;
    private String sessao = "123";
    private boolean tituloValido = false;
    private boolean sessaoValida = false;
    String eleitor = "";

    public void verificaTitulo() {
        do {

            System.out.print("Informe seu título: ");
            this.titulo = sc.nextLine();
            if (titulo.length() != 16) {
                System.out.print("Número inválido ");
            } else {
                System.out.println("Título válido... ");
                tituloValido = true;
            }

            System.out.print("Informe a sessão: ");
            sessao = sc.next();
            if (!sessao.equals("123")) {
                System.out.println("Dirija-se a outra sessão.\n" +
                        "Sessão informada não conrresponde a sessão presente.");
            } else {
                System.out.println("Sessão válida. Dirija-se a votação.");
                sessaoValida = true;
            }

            eleitor = sc.next();
            switch (eleitor) {
                case "1":
                    verificaTitulo();
                    break;
                case "2":
                    System.out.println("Finaliza seção");
                    break;
                default:
                    System.out.println("Opção inválida... ");
                    break;
            }

            sc.close();

        } while (!eleitor.equals("2"));


    }
}
