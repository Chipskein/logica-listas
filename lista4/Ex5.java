import java.util.Scanner;
public class Ex5 {
    /* 
        Faça um programa que receba a 5 notas de um aluno, através do comando while, e
        que apresente ao final a média dessas 5 notas. Você deverá ter apenas uma
        variável nota, e uma variável média.
    */
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int n_notas=5;
        float soma=0.0f;
        int c=1;
        while(c<=n_notas){
            float nota=in.nextFloat();
            if(nota<0){
                System.out.println("Nota invalida Digite novamente");
                continue;
            }
            soma+=nota;
            c++;
        }
        float media=soma/n_notas;
        System.out.println(media);
        in.close();
    }
}
