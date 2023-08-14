import java.util.Scanner;
public class Ex2 {
    /*
        Ler um número inteiro n. Escrever a soma de todos os números pares de 2 até n. 
    */
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        while(n<2){
            System.out.println("N tem q ser maior igual a 2");
            n=in.nextInt();
        }
        int soma=0;
        for(int i=2 ;i<=n;i+=2){
            soma+=i;
        }
        System.out.println(soma);
        in.close();
    }
}
