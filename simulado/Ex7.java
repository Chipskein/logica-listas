import java.util.Scanner;
public class Ex7{
    /*
        Faça um programa que dado um valor inicial indicando quantos valores serão
        digitados. Leia os valores e indique quantas quedas (quando um valor é menor que
        o anterior) aconteceram durante a sequência. Exemplo:
        Informe a quantidade de valores: 5
        Informe os valores:
        100 199 199 198 0
        Resultado: 2 quedas
        ** Houve uma queda do 199 para o 198 e outro do 198 para o 0.
    */
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        System.out.println("Digite o número de valores");
        int qt_valores=in.nextInt();
        int anterior=0;
        int quedas=0;
        for(int i=1;i<=qt_valores;i++){
            int valor=in.nextInt();
            if(i==1){
                anterior=valor;
                continue;
            }        
            if(valor<anterior){
                quedas++;
            }
            anterior=valor;
        }
        System.out.printf("Resultado: %d quedas",quedas);
        in.close();
    }
}
