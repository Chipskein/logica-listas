import java.util.Scanner;
public class Ex3 {
    /*
     Ler um número inteiro n. Decidir se n é um número primo e apresente o resultado
    */
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        if(n<0) {
            n=Math.abs(n);
        };
        int divisores_count=0;
        for(int i=1;i<=n;i++){
            if(n%i==0){
                divisores_count++;
            }
        }
        if(divisores_count==2){
            System.out.printf("%d é primo\n",n);
        } else{
            System.out.printf("%d não é primo\n",n);
        }


        
        in.close();
    }
}
