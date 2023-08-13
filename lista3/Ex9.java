import java.util.Scanner;
public class Ex9 {
    /*
        Escreva um algoritmo que 
            leia as notas das duas avaliações normais e 
            a nota da avaliação optativa. 
        Caso o aluno não tenha feito a optativa deve ser fornecido o valor
            –1. Calcular a média do semestre considerando que a prova optativa substitui a nota
        mais baixa entre as duas primeiras avaliações.
         Escrever a média e mensagens que
        indiquem se o aluno foi aprovado, reprovado ou está em exame, de acordo com as
        informações abaixo:
        Aprovado : media >= 6.0
        Reprovado: media < 3.0
        Exame : media >= 3.0 e < 6.0
    */
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        String status="Exame";
        float media_exame_min=3.0f;
        float media_aprova=6.0f;
        float nota1=in.nextFloat();
        float nota2=in.nextFloat();
        while(nota2<0||nota1<0){
            System.out.println("Notas negativas digite novamente");
            nota1=in.nextFloat();
            nota2=in.nextFloat();
        }
        System.out.println("Aluno fez optativa(true/false)");
        boolean aluno_fez_optativa=in.nextBoolean();
        float nota_optativa;
        if(aluno_fez_optativa){
            nota_optativa=in.nextFloat();
            while(nota_optativa<0){
                System.out.println("Nota optativa negativa digite novamente");
                nota_optativa=in.nextFloat();
            }
            if(nota1>=nota2){
                nota2=nota_optativa;
            } else{
                nota1=nota_optativa;
            }
        }
        float media=(nota1+nota2)/2.0f;
        if(media>=media_aprova){
            status="Aprovado";
        } else if(media<media_exame_min){
            status="Reprobado";
        }
        System.out.printf("Media:%.2f\nStatus:%s\n",media,status);
        in.close();
    }
}
