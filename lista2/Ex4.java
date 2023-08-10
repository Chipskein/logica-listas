import java.util.Scanner;
public class Ex4 {
    /*
       Escreva um programa que faça a leitura de dois valores inteiros e descubra qual
        deles é o maior, imprimindo na resposta o nome da variável e o seu valor
    */
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Digite um número ai chamado n1:");
        int n1=in.nextInt();
        System.out.println("Digite um número ai chamado n2:");
        int n2=in.nextInt();
        if(n1==n2){
            System.out.printf("%d(n1) e %d(n2) são iguais",n1,n2);
        }
        else{
            if(n1>n2){
                System.out.printf("%d(n1) é maior",n1);
            }
            else{
                System.out.printf("%d(n2) é maior",n2);
            }
        }
        in.close();
    }
}
