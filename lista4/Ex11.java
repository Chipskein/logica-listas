import java.util.Scanner;
public class Ex11 {
    /*
        Escreva um algoritmo para ler 2 valores e, se o segundo valor informado for ZERO,
        deve ser lido um novo valor, ou seja, para o segundo valor lido não pode ser aceito o
        valor zero. Após ler os 2 valores, imprimir o resultado da divisão do primeiro valor
        lido pelo segundo valor lido.
    */
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        float valor1=in.nextFloat();
        float valor2=in.nextFloat();
        while(valor2==0){
            System.out.println("Valor 2 é zero digite dnv");
            valor2=in.nextFloat();
        }
        float divisao=valor1/valor2;
        System.out.printf("%.2f/%.2f = %.2f",valor1,valor2,divisao);
        in.close();
    }
}
