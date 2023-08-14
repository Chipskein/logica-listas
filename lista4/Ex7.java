import java.util.Scanner;
public class Ex7 {
    /*
        Escreva um algoritmo para ler uma senha. Se o usuário não digitar a senha correta
        que é 12345, o algoritmo deve ler novamente, até que seja a senha correta. O
        algoritmo deve também contar quantas vezes o usuário tentou digitar a senha
        correta, ou seja, quantas tentativas de acerto aconteceram. Escrever essa
        informação na tela.
    */   
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int senha_correta=12345;
        int senha_incorreta_counter=0;
        int senha=in.nextInt();
        while(senha_correta!=senha){
            System.out.println("Senha incorreta");
            senha=in.nextInt();
            senha_incorreta_counter++;
        }
        System.out.printf("Tentou acertar %d vezes\n",senha_incorreta_counter);
        in.close();
    }
}
