import java.util.Scanner;
public class Ex14 {
    /*
         Ler o ano atual e o ano de nascimento de uma pessoa. Escrever uma mensagem
        que diga se ela poderá ou não votar este ano (não é necessário considerar o mês
        em que a pessoa nasceu).
    */
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int ano_hj=in.nextInt();
        int ano_nasc=in.nextInt();
        int idade_votar=16;
        int idade=ano_hj-ano_nasc;
        if(idade>=idade_votar){
            System.out.println("Vota ai parceiro");
        }
        else{
            System.out.println("Não pode votar garai");
        }
        in.close();
    }
}
