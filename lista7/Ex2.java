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
        int ano=in.nextInt();
        int mes=in.nextInt();
        boolean eh_bissexto = ((ano % 400) == 0) || ( (ano % 4 == 0) && (ano % 100 != 0));

        in.close();
    }
}
