import java.util.Scanner;
public class Ex6 {
    /*
        Escreva um algoritmo para ler um valor entre 1 (inclusive) e 10 (inclusive). Se o valor
        lido não estiver entre 1 (inclusive) e 10 (inclusive), deve ser lido um novo valor. Após
        a leitura do valor, escrever o valor lido na tela.
    */
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        float min=1.0f;
        float max=10.0f;
        float valor=in.nextFloat();
        while(valor>max || valor<min){
            System.out.println("Valor precisa estar entre 1 e 10. Digite novamente");
            valor=in.nextFloat();
        }
        System.out.println(valor);
        in.close();
    }
}
