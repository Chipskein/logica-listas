import java.util.Scanner;
public class Ex30 {
    /*
        30. HARD - Faça um programa que mostre os n termos da Série a seguir:
        S = 1/1! + 2/3! + 3/5! + 4/7! + 5/9! + ... + n/m!.
        Imprima no final a soma da série. O fatorial é calculado da seguinte maneira:
        5! = 5 * 4 * 3 * 2 * 1
        9! = 9 * 8 * 7 * 6 * 5 * 4 * 3 * 2 * 1 
    */
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int numerador=1;
        int denominador=1;
        float soma=0;
        for(int i=1;i<=n;i++){
            int k=denominador;
            int factorial=1;
            for(int j=1;j<=k;j++){
                factorial*=j;
            }
            float resultado=(float)numerador/(float)factorial;
            soma+= resultado;
            System.out.printf("%d/%d = %f\n",numerador,factorial,resultado);
            numerador++;
            denominador+=2;
        }
        System.out.printf("Soma:%f\n",soma);
        in.close();
    }
}
