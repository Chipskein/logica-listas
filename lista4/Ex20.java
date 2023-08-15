import java.util.Scanner;
public class Ex20 {
    /*
        Escreva um programa que lê o tamanho do lado de um quadrado e imprime um
        quadrado daquele tamanho com asteriscos. Seu programa deve funcionar para
        quadrados com lados de todos os tamanhos entre 1 e 20.
    */
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int lado=in.nextInt();
        while(lado<2||lado>20){
            System.out.println("Lado invalido.Digite novamente");
            lado=in.nextInt();
        }
        String quadrado="";
        for(int linha=1;linha<=lado;linha++){
            quadrado+="*".repeat(lado)+"\n";
        }
        System.out.println(quadrado);
        in.close();
    }
}
