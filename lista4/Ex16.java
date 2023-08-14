import java.util.Scanner;
class Ex16{
    /*
        Receba um número inteiro positivo, e o seu respectivo expoente inteiro positivo, e
        apresente o resultado da potência deste número. Faça isso utilizando o comando
        while. Tenha cuidado com as inicializações!
    */
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int numero=in.nextInt();
        int expoente=in.nextInt();
        int resultado=1;
        while(numero<0||expoente<0){
            System.out.println("numero ou expoente negativos");
            numero=in.nextInt();
            expoente=in.nextInt();
        }
        int i=1;
        while(i<=expoente){
            resultado*=numero;
            i++;
        }
        System.out.printf("%d^%d=%d",numero,expoente,resultado);
        in.close();
    }
}