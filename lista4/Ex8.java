import java.util.Scanner;
public class Ex8 {
    /*
        Uma loja está levantando o valor total de todas as mercadorias em estoque. Escreva
        um algoritmo que permita a entrada das seguintes informações:
        a) o número total de mercadorias no estoque
        b) o valor de cada mercadoria.
        Ao final imprimir o valor total em estoque e a média dos valores das mercadorias 
    */
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        float soma=0.0f;
        int n_mercadorias=in.nextInt();
        while(n_mercadorias<=0){
            System.out.println("numero de mercadorias invalido");
            n_mercadorias=in.nextInt();
        }
        for(int i=1;i<=n_mercadorias;i++){
            float valor_mercadoria=in.nextFloat();
            if(valor_mercadoria<=0){
                System.out.println("Valor da mercadoria invalido");
                i--;
                continue;
            }
            soma+=valor_mercadoria;
        }
        float media=soma/n_mercadorias;
        System.out.printf("Valor total do estoque %.2f\nMedia do valor no estoque %.2f\n",soma,media);
        in.close();
    }
}
