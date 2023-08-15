import java.util.Scanner;
public class Ex21 {
    /*
        Escreva um programa em JAVA para calcular a média de valores PARES e
        ÍMPARES, que serão digitados pelo usuário. Ao final o algoritmo deve mostrar estas
        duas médias. O algoritmo deve mostrar também o maior número PAR digitado e o
        menor número ÍMPAR digitado. Para finalizar o usuário irá digitar um valor negativo. 
    */
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int numero=in.nextInt();
        int soma_pares=0;
        int soma_impares=0;
        int n_pares=0;
        int n_impares=0;
        int maior_par=0;
        int menor_impar=0;
        while(numero>=0){
            if(numero % 2 == 0){
                soma_pares+=numero;
                n_pares++;
                if(numero>=maior_par){
                    maior_par=numero;
                }
            }
            else{
                if(n_impares==0){
                    menor_impar=numero;
                }
                if(numero<=menor_impar){
                    menor_impar=numero;
                }
                soma_impares+=numero;
                n_impares++;
            }
            System.out.println("Digite um numero");
            numero=in.nextInt();
        }
        if(n_pares!=0){
            float media_pares = (float)soma_pares/n_pares;
            System.out.printf("Media pares:%.2f\nMaior Par:%d\n",media_pares,maior_par);
        }
        if(n_impares!=0){
            float media_impares =(float)soma_impares/n_impares;
            System.out.printf("Media Impares:%.2f\nMenor Impar:%d\n",media_impares,menor_impar);
        }
        in.close();
    }
}
