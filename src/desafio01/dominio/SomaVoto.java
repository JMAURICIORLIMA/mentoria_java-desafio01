package desafio01.dominio;

import java.util.Scanner;

public class SomaVoto {
    private Eleitor eleitor;
    private Candidatos candidatos;
    private int votosCandidato1;
    private int votosCandidato2;
    public void somaDeVotos(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Seu voto");
        int voto = sc.nextInt();
        if (candidatos.getNumeroCandidato().equals(1)){
            candidatos.setRecebeVoto(voto);
        } else {
            votosCandidato2++;
        }
    }
}
