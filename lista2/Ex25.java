import java.util.Scanner;
public class Ex25 {
    /*
        Faça um programa que leia o valor de um produto X e leia a quantidade de reais de
        um cofrinho que contenha:
        ♦ N moedas de 1 real;
        ♦ N moedas de 50 centavos;
        ♦ N moedas de 25 centavos;
        ♦ N moedas de 10 centavos;
        ♦ N moedas de 5 centavos;
        O programa deverá verificar se o total de reais que contém no cofrinho é o bastante
        para a compra o produto X 
    */
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        float valor_produto=in.nextFloat();
        int qt_1real=in.nextInt();
        int qt_50c=in.nextInt();
        int qt_25c=in.nextInt();
        int qt_10c=in.nextInt();
        int qt_5c=in.nextInt();
        String msg;
        float qt_reais = qt_1real+ qt_50c*0.50f +qt_25c*0.25f+qt_10c*0.10f+qt_5c*0.05f;
        if(qt_reais>=valor_produto){
            msg="Compra garai";
        } else{
            msg="Não compra nao";
        }
        System.out.println(msg);
        in.close();
    }
}
