import java.util.Scanner;
public class Ex22 {
    /*
q       Faça um algoritmo para ler: 
            número da conta do cliente,
            saldo, 
            débito e 
            crédito.
        Após, calcular e escrever o saldo atual (saldo atual = saldo - débito + crédito).
        Também testar se saldo atual for maior ou igual a zero escrever a mensagem “Saldo
        Positivo”, senão escrever a mensagem “Saldo Negativo”.
     */
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int n_conta=in.nextInt();
        float saldo=in.nextFloat();
        float debito=in.nextFloat();
        float credito=in.nextFloat();
        float saldo_atual=saldo-debito+credito;

        String saldo_status;
        if(saldo_atual>=0){
            saldo_status="Saldo Positivo";
        }
        else{
            saldo_status="Saldo Negativo";
        }
        System.out.printf("Conta:%d\nSaldo Atual:%.2f\n%s\n",n_conta,saldo_atual,saldo_status);
        in.close();
    }
}
