import java.util.Scanner;
import java.lang.Math;
public class Ex6{
    /*
        Crie um programa que dado um valor inteiro, converta o número de forma que ele
        passe a valer seus dígitos na ordem inversa. Por exemplo, o número 1000 passa a
        valer 0001, ou seja, 1. O valor 1234 se torna 4321. NÃO DEVE SER UTILIZADO
        STRINGS! É um problema de repetição.
    */
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        System.out.println("Digite um numero");
        int numero=in.nextInt();
        int numero_de_casa=0;
        int numero_temp=numero;
        while(numero_temp>0){
            numero_temp/=10;
            numero_de_casa++;
        }
        numero_temp=numero;
        int novo_numero=0;
        int potencia=numero_de_casa-1;
        for(int i=0;i<numero_de_casa;i++){
            //se não usar o Math.pow tu vai ter que fazer uns for ai pra calcular a potencia
            int digit = numero_temp/(int)Math.pow(10,potencia);
            numero_temp = numero_temp%(int)Math.pow(10,potencia);
            novo_numero+=digit*Math.pow(10,i);
            potencia--;
        }
        System.out.println(novo_numero);
        in.close();
    }
}
