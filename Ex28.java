import java.util.Scanner;
public class Ex28 {
    /*
        Crie um programa para informar quais e quantas notas são necessárias para
        entregar o mínimo de cédulas para um determinado valor informado pelo usuário
        considerando notas de R$ 100, R$ 50, R$ 10 e R$ 5 e R$ 1. Seu programa deve
        mostrar apenas as notas utilizadas. Por exemplo, ao solicitar R$18, o programa deve
        informar apenas a seguinte informação (note que não foram exibidas informações
        sobre as demais cédulas):
        1 nota(s) de R$ 10.
        1 nota(s) de R$ 5.
        3 nota(s) de R$ 1.
        O programa deve ficar perguntando qual o próximo valor a ser sacado até que seja
        informado o número 0.
     */
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int valor=-1;
        
        while(valor!=0){
            valor=in.nextInt();
            if(valor<0){
                System.out.println("Saque negativo Digite novamente");
                continue;
            }
            int n_notas1=0;
            int n_notas5=0;
            int n_notas10=0;
            int n_notas50=0;
            int n_notas100=0;
            while(valor>=1){
                if(valor>=100){
                    n_notas100++;
                    valor-=100;
                    continue;
                }
                if(valor>=50){
                    n_notas50++;
                    valor-=50;
                    continue;
                }
                if(valor>=10){
                    n_notas10++;
                    valor-=10;
                    continue;
                }
                if(valor>=10){
                    n_notas10++;
                    valor-=10;
                    continue;
                }
                if(valor>=5){
                    n_notas5++;
                    valor-=5;
                    continue;
                }
                if(valor>=1){
                    n_notas1++;
                    valor-=1;
                    continue;
                }
            }
            
            if(n_notas100>=1) System.out.printf("%d nota(s) de R$ 100.\n",n_notas100);
            if(n_notas50>=1) System.out.printf("%d nota(s) de R$ 50\n",n_notas50);
            if(n_notas10>=1) System.out.printf("%d nota(s) de R$ 10\n",n_notas10);
            if(n_notas5>=1) System.out.printf("%d nota(s) de R$ 5\n",n_notas5);
            if(n_notas1>=1) System.out.printf("%d nota(s) de R$ 1\n",n_notas1);
        }
        in.close();
    }
}
