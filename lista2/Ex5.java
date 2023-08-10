import java.util.Scanner;
public class Ex5 {
    /*
        Escreva um programa que faça a leitura de dois valores reais e faça a divisão entre
        eles se o denominador não for zero. Ao final deve ser impresso o resultado ou uma
        mensagem de erro.
    */
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Digite o numerador");
        float numerador=in.nextFloat();
        System.out.println("Digite o denominador");
        float denominador=in.nextFloat();
        if(denominador==0){
            System.out.println("Denominador é zero");
        }
        else{
            float divisao=numerador/denominador;
            System.out.printf("%.2f/%.2f = %.2f\n",numerador,denominador,divisao);
        }
        in.close();
    }
}
