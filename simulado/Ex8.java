import java.util.Scanner;
import java.util.Random;
public class Ex8{
    /*
        Alunos do Campus Rio Grande desenvolveram um jogo de cartas onde cada carta
        representa um(a) professor@. Os professores possuem habilidades de teoria e
        prática que podem ir de 5 a 10. A forma de duelo entre as cartas é simples, a carta
        que tiver mais pontos na rodada é a vencedora. A pontuação da carta é calculada da
        seguinte maneira:
        pontuacao = (teoria + pratica)/2 + bonus
        O valor do bônus é obtido através do lançamento de um dado de 6 lados.
        Os alunos do TADS, desenvolveram uma versão digital do Jogo para testarem suas
        habilidades. No programa, primeiro deve ser indicado o número de partidas que serão
        simuladas. Depois, para cada partida serão indicado 4 valores referentes a teoria e prática
        de cada carta de professor. Para cada simulação, deve ser apresentado qual foi a carta
        vencedora ou se houve empate.
    */
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        Random gerador=new Random();
        System.out.println("Digite o numero de partidas");
        int partidas=in.nextInt();
        for(int i=1;i<=partidas;i++){
            System.out.println("Digite os valores da carta A");
            int carta_teoriaA=in.nextInt();
            int carta_praticaA=in.nextInt();
            int bonusA=gerador.nextInt(1,6);
            System.out.println("Digite os valores da carta B");
            int carta_teoriaB=in.nextInt();
            int carta_praticaB=in.nextInt();
            int bonusB=gerador.nextInt(1,6);
            float pontuacaoA=(carta_teoriaA+carta_praticaA)/2.0f+bonusA;
            float pontuacaoB=(carta_teoriaB+carta_praticaB)/2.0f+bonusB;
            System.out.printf("Carta A: %.2f + %d = %.2f\n",((carta_teoriaA+carta_praticaA)/2.0f),bonusA,pontuacaoA);
            System.out.printf("Carta B: %.2f + %d = %.2f\n",((carta_teoriaB+carta_praticaB)/2.0f),bonusB,pontuacaoB);
            if(pontuacaoA>pontuacaoB){
                System.out.println("A Venceu");
            } else if (pontuacaoA==pontuacaoB){
                System.out.println("Empate");
            } else{
                System.out.println("B Venceu");
            }
        }
        in.close();
    }
}
