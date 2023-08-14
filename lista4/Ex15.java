import java.util.Scanner;
public class Ex15 {
    /*
        Fazer um algoritmo que leia um número inteiro e escreva se ele é ou não um
        número primo. Um número é primo quando ele é divisível somente por um e por ele
        mesmo. Você utilizará uma combinação entre os comandos while e if.
    */
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        if(n<0) n=Math.abs(n);
        int c=1;
        int c_divisores=0;
        while(c<=n){
            if(n % c == 0){
                c_divisores++;
            }
            c++;
        }
        if(c_divisores==2){
            System.out.println("Primo");
        } else{
            System.out.println("Nao é Primo");
        }
        in.close();
    }
}
