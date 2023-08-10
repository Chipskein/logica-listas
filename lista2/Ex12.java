import java.util.Scanner;
class Ex12{
    /* 
        As maçãs custam R$ 1.50 cada se forem compradas menos de uma dúzia, e R$
        1.30 se forem compradas pelo menos 12. Escreva um programa que leia o número
        de maçãs compradas, calcule e escreva o custo total da compra.
    */
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int n_macas=in.nextInt();
        float valor_maca_menor_q_duzia=1.5f;
        float valor_maca_ao_menos_duzia=1.3f;
        float total_a_pagar;
        if(n_macas < 12){
            total_a_pagar=n_macas*valor_maca_menor_q_duzia;
        } else{
            total_a_pagar=n_macas*valor_maca_ao_menos_duzia;
        }
        System.out.printf("Total:%.2f\n",total_a_pagar);
        in.close();
    }
};