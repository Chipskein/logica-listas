import java.util.Scanner;
class Ex1{
    /*Ler um número inteiro n. Escrever a soma de todos os números de 1 até n */
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        while(n<1){
            System.out.println("n invalido precisa ser maior q 1 digita ai parça");
            n=in.nextInt();
        }
        int soma=0;
        for(int i=1;i<=n;i++){
            soma+=i;
        }
        System.out.println(soma);
        in.close();
    }
}