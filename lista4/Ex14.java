import java.util.Scanner;
public class Ex14 {
    /*
        Ler 10 valores e escrever quantos desses valores lidos estão compreendidos entre o
        intervalo de 1 até 10. 
        Mostre a multiplicação entre valores digitados no intervalo de 0
        e 10, e a soma dos valores fora deste intervalo.
    */   
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        float multiplicacao=1.0f;
        float soma=0.0f;
        int count_entre_1_e_10=0;
        for(int i=1;i<=10;i++){
            float valor=in.nextFloat();
            if(valor>=1&&valor<=10){
                count_entre_1_e_10++;
            }
            if(valor>=0&&valor<=10){
                multiplicacao*=valor;
            } else{
                soma+=valor;
            }
        }
        System.out.printf("Qt Valores entre 1 e 10 %d\nMultiplicação:%.2f\nSoma:%.2f\n",count_entre_1_e_10,multiplicacao,soma);
        in.close();
    }
}
