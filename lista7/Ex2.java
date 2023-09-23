import java.util.Scanner;
public class Ex2{
    /*
      Escreva um programa em Java que dado o mês do ano, 
      indique quantos dias tem o
      mês informado. Obs: Atente-se para o caso dos anos bissextos
      //31=[janeiro,março,maio,julho,agosto,outubro,dezembro]
      //28=[fevereiro]
      //29=[fevereiro]
      //30=[abril,junho,setembro,novembro]
    */
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        System.out.println("Digite o ano e o mes");
        final int FEVEREIRO=2;
        final int ABRIL=4;
        final int JUNHO=6;
        final int SETEMBRO=9;
        final int NOVEMBRO=11;
        int ano=in.nextInt();
        int mes=in.nextInt();
        int dias=0;
        boolean ano_eh_bissexto = ((ano % 400) == 0) || ( (ano % 4 == 0) && (ano % 100 != 0));
        boolean mes_tem_30_dias=mes==ABRIL||mes==JUNHO||mes==SETEMBRO||mes==NOVEMBRO;
        if(mes_tem_30_dias)
          dias=30;
          else if( ano_eh_bissexto && mes==FEVEREIRO)
            dias=29;
          else if (mes==FEVEREIRO) 
            dias=28;
        else
          dias=31;
        System.out.printf("Mes:%d\nAno:%d\nBissexto:%b\nDias:%d\n",mes,ano,ano_eh_bissexto,dias);
        in.close();
    }
}
