import java.util.Scanner;
class Ex13{
    /* 
        . Ler as notas da 1a. e 2a. avaliações de um aluno. Calcular a média aritmética
        simples e escrever uma mensagem que diga se o aluno foi ou não aprovado
        (considerar que média igual ou maior que 6.0 o aluno é aprovado). Escrever também
        a média calculada.
    */
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        float nota_aprova=6.0f;
        float nota1=in.nextFloat();
        float nota2=in.nextFloat();
        float media_nota=(nota1+nota2)/2;
        String status;
        if(nota_aprova<=media_nota) status="aprovado";
        else status="reprovado";
        System.out.printf("Status:%s\n Nota:%.2f\n",status,media_nota);
        in.close();
    }
};