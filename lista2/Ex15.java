import java.util.Scanner;

public class Ex15 {
    /*
        Ler a hora de início e a hora de fim de um jogo de Xadrez (considere apenas horas
        inteiras, sem os minutos) e calcule a duração do jogo em horas, sabendo-se que o
        tempo máximo de duração do jogo é de 24 horas e que o jogo pode iniciar em um
        dia e terminar no dia seguinte
    */
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int hr_inicio=in.nextInt();
        int hr_fim=in.nextInt();
        if(hr_fim==0) hr_fim=24;
        if(hr_inicio==0) hr_inicio=24;
        int duracao;
        if(hr_fim>=hr_inicio){
            //mesmo dia
            duracao=hr_fim-hr_inicio;
        } else{
            //no outro dia
            duracao=24-hr_inicio + hr_fim;
        }
        if(hr_fim==24) hr_fim=0;
        if(hr_inicio==24) hr_inicio=0;
        System.out.printf("Começou %d\nTerminou: %d\nDurou:%d\n",hr_inicio,hr_fim,duracao);
        in.close();
    }
}
