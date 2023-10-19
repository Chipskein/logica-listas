import java.util.Scanner;
public class Ex3{
    /*
        Crie um programa que receba inicialmente um valor inteiro do usuário. Após, o
        programa deve ficar recebendo novos valores até que seja digitado o valor 0. Para
        cada valor digitado, o programa deve indicar se o valor é um múltiplo, divisor ou
        nada do número anterior.
    */
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int valor_anterior=0;
        while(true){
            System.out.println("Informe um numero");
            int valor=in.nextInt();
            if(valor==0){
                break;
            }
            if(valor_anterior!=0){
                Boolean eh_multiplo=valor % valor_anterior==0;
                Boolean eh_divisor=valor_anterior% valor==0;
                if (eh_multiplo)
                    System.out.printf("%d é multiplo de %d\n",valor,valor_anterior);
                else if(eh_divisor)
                    System.out.printf("%d é divisor de %d\n",valor,valor_anterior);
                else
                    System.out.printf("%d não é nada de %d\n",valor,valor_anterior);
            }
            valor_anterior=valor;
        }
        in.close();
    }
}