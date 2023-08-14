import java.util.Scanner;
public class Ex4 {
    /*
        Escreva um programa que apresente quatro opções: 
            (a) consulta saldo, 
            (b) saque e
            (c) depósito e 
            (d) sair. 
        O saldo deve iniciar em R$ 0,00. A cada saque ou depósito o
        valor do saldo deve ser atualizado. 
    */
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        double saldo=0.00;
        boolean loop=true;
        while(loop){
            System.out.print("(a) consulta saldo\n(b) saque\n(c) depósito\n(d) sair\n");
            String option=in.next();
            switch(option){
                case "a":
                    System.out.printf("Saldo:%.2f\n",saldo);
                    break;
                case "b":
                    System.out.println("Digite o valor para sacar:");
                    double valor_para_sacar=in.nextDouble();
                    if(saldo-valor_para_sacar>0.00){
                        saldo-=valor_para_sacar;
                    } else{
                        System.out.println("Valor do saque maior que o saldo");
                    }
                    break;
                case "c":
                    System.out.println("Digite o valor para deposito:");
                    double valor_para_deposito=in.nextDouble();
                    saldo+=valor_para_deposito;
                    break;
                case "d":
                    loop=false;
                    break;
                default:
                    System.out.println("Opção invalida");
                    break;
            }
        }
        in.close();
    }
    
}
