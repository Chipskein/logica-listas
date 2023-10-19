import java.util.Scanner;
public class Ex4{
    /*
        Faça um programa que receba 3 valores inteiros. Os dois primeiros valores indicam
        um intervalo, o terceiro valor indica um divisor. O programa deve calcular a soma
        dos valores dentro do intervalo que são divisíveis pelo terceiro valor.
        Por exemplo:
        Informe 3 valores: 5 10 2
        Resultado: 24
        ** 6, 8 e 10 são os valores somados dentro do intervalo 5 e 10 que são múltiplos de
        2.
    */
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        System.out.println("Digite o começo do intervalo e fim do intervalo e o divisor");
        int comeca_intervalo=in.nextInt();
        int fim_intervalo=in.nextInt();
        int divisor=in.nextInt();
        int somatorio=0;
        for(int i=comeca_intervalo;i<=fim_intervalo;i++){
            if(i%divisor==0){
                somatorio+=i;
            }
        }
        System.out.println(somatorio);
    }
}