import java.util.Scanner;
public class Ex13 {
    /*
        Supondo que a população de um país A seja da ordem de X de habitantes com uma
        taxa anual decrescimento de 3% e que a população de um país B seja,
        aproximadamente, de Y de habitantescom uma taxa anual de crescimento de 1,5%,
        fazer um algoritmo que calcule e escreva o número de anos necessários para que a
        população do país A ultrapasse ou iguale a população do país B, mantidas essas
        taxas de crescimento. Considere X < Y. 

    */
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        final float TX_CRES_A=0.030f;
        final float TX_CRES_B=0.015f;
        int anos=0;
        System.out.println("Digite o numero de habitantes dos paises a e b:");
        int populacaoA=in.nextInt();
        int populacaoB=in.nextInt();
        /*
            'float' ao invés de 'int' pois quando :
                (10*TX_CRES_A) =>(int)0.3 => 0 
                Causa loop infinito
        */
        float populacaoA_f=(float)populacaoA;
        float populacaoB_f=(float)populacaoB;
        while(populacaoA_f<populacaoB_f){
            populacaoA_f+=(populacaoA_f*TX_CRES_A);
            populacaoB_f+=(populacaoB_f*TX_CRES_B);
            anos++;
        }
        System.out.printf("Anos:%d\nPais A:%d\nPais B:%d\n",anos,(int)populacaoA_f,(int)populacaoB_f);
        in.close();
    }


}
