import java.util.Scanner;
public class Ex6 {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        //Calendar c=new Calendar();
        /*
            Faça um algoritmo que leia a idade de uma pessoa expressa em anos, meses e dias
            e escreva a idade dessa pessoa expressa apenas em dias. Considerar ano com 365
            dias e mês com 30 dias. Calcular quantos dias a pessoa já viveu até hoje.
        */
        int qt_dias_no_mes=30;
        int qt_dias_no_ano=365;
        System.out.println("Digite o sua idade");
        int idade = in.nextInt();
        if(idade<0) idade=Math.abs(idade);
        int viveu_anos=idade;
        int viveu_dias=idade*qt_dias_no_ano;
        int viveu_mes = viveu_dias/qt_dias_no_mes;
        System.out.printf("Viveu Anos:%d\nViveu Dias:%d\nViveu Mes:%d\n",viveu_anos,viveu_dias,viveu_mes);
        in.close();
    }
}
