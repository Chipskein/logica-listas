import java.util.Scanner;
public class Ex13 {
    /*
        Faça um programa que receba 3 notas de um aluno, e escolha apenas as duas
        maiores notas para o cálculo da média. Apresente a média final, entre as duas
        maiores notas. Dica: utilize 3 comandos if.
    */
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        float nota1=in.nextFloat();
        float nota2=in.nextFloat();
        float nota3=in.nextFloat();
        while(nota1<0||nota2<0||nota3<0){
            System.out.println("Notas Invalidas. Digite novamente");
            nota1=in.nextFloat();
            nota2=in.nextFloat();
            nota3=in.nextFloat();
        }
        float maior1=0.0f;
        float maior2=0.0f;

        if(nota1>=nota2&&nota1>=nota3){
            maior1=nota1;
            if(nota2>=nota3){
                maior2=nota2;
            } else{
                maior2=nota3;
            }
        }
        
        if(nota2>=nota1&&nota2>=nota3){
            maior1=nota2;
            if(nota1>=nota3){
                maior2=nota1;
            } else{
                maior2=nota3;
            }
        }
        
        if(nota3>=nota2&&nota3>=nota1){
            maior1=nota3;
            if(nota2>=nota1){
                maior2=nota2;
            } else{
                maior2=nota1;
            }
        }
        float media=(maior1+maior2)/2;
        System.out.printf("Media:%.2f\n",media);
        in.close();
    }
}
