import java.util.Scanner;
public class Ex14 {
    /*
        Faça um programa que receba os valores de 3 notas de um aluno e apresenta um
        conceito baseado na tabela abaixo 
        >=9 a
        >=7.5 < 9 b
        >=6 < 7.5 c
        < 6 d
    */
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        float nota1=in.nextFloat();
        float nota2=in.nextFloat();
        float nota3=in.nextFloat();
        char conceito=' ';
        while(nota1<0||nota2<0||nota3<0){
            System.out.println("notas negativas Digite todas novamente");
            nota1=in.nextFloat();
            nota2=in.nextFloat();
            nota3=in.nextFloat();
        }
        float media=(nota1+nota2+nota3)/3;
        if(media>=9.0f){
            conceito='A';
        }
        if(media<9.0f&&media>=7.5f){
            conceito='B';
        }
        if(media<7.5f&&media>=6){
            conceito='C';
        }
        if(media<6.0f){
            conceito='D';
        }
        System.out.printf("Media:%.2f\nConceito:%s\n",media,conceito);
        in.close();
    }
}
