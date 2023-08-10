import java.util.Scanner;
class Ex11{
    /* 
            Faça um programa que receba dois números e efetua a adição. Caso o valor
            somado seja maior que 20, este deverá ser apresentado somando-se a ele 8; caso
            o valor somado seja menor ou igual a 20, este deverá ser apresentado subtraindo-se
            10.
    */
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int n1=in.nextInt();
        int n2=in.nextInt();
        int valor_a_somar=8;
        int valor_a_sub=10;
        int valor_maior_que=20;
        int soma_print;
        int soma=n1+n2;
        if(soma>valor_maior_que){
            soma_print=valor_a_somar+soma;
        } else {
            soma_print=soma-valor_a_sub;
        }
        System.out.printf("N1:%d\nN2:%d\nResultado:%d\n",n1,n2,soma_print);
        in.close();
    }
};