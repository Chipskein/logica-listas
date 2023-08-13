import java.util.Scanner;
public class Ex2 {
    /*
        Ler três valores (considere que não serão informados valores iguais) e escrever o
        maior deles.
    */
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int n1=in.nextInt();
        int n2=in.nextInt();
        int n3=in.nextInt();
        int maior=0;
        while(n1==n2||n2==n3||n1==n3){
            System.out.println("numeros iguais digita ai cabeçao");
            n1=in.nextInt();
            n2=in.nextInt();
            n3=in.nextInt();
        }
        if(n1>n2&&n1>n3){
            maior=n1;
        }
        if(n2>n1&&n2>n3){
            maior=n2;
        }
        if(n3>n2&&n3>n2){
            maior=n3;
        }
        System.out.printf("O maior é esse ai ó %d\n",maior);
        in.close();
    }       
}
