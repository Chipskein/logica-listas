import java.util.Scanner;
public class Ex8{
    /*
        Faça um programa que leia valores inteiros positivos do usuário até que seja
        digitado um valor maior que o dobro do anterior.
    */
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int numero=0;
        int anterior= 0;
        while(true){
            anterior=numero;
            numero=in.nextInt();
            if(numero<(anterior*2)&&numero!=0&&anterior!=0){
                break;
            }
        }
        System.out.printf("Anterior:%d\nNumero:%d\n",anterior,numero);
        in.close();
    }
}