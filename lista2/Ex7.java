import java.util.Scanner;
public class Ex7 {
    public static void main(String[] args){
        /* 
            Faça um algoritmo que pergunte quanto a pessoa ganha por hora (salário por hora)
            e o número de horas trabalhadas no mês. 
            Calcule e mostre o total do seu salário no referido mês e qual será seu salário atual. 
            Calcule também o salário líquido
            (desconto de impostos) considerando 15% de impostos e mostre esses valores.

            a. Pergunte ao usuário qual a % de imposto que é descontada do salário.
        */
        Scanner in=new Scanner(System.in);

        System.out.println("Digite o seu salário hora:");
        float salario_hr=in.nextFloat();

        System.out.println("Digite o numero de horas trabalhadas no mês:");
        int hrs_trabalhadas=in.nextInt();

        System.out.println("Digite a taxa de imposto:");
        float tx_imposto=in.nextFloat();

        float total_no_mes=hrs_trabalhadas*salario_hr;
        float salario_bruto=total_no_mes;
        float salario_liquido= salario_bruto-salario_bruto*tx_imposto/100;

        System.out.printf("Salário bruto:%.2f\nSalário liquido:%.2f\n",salario_bruto,salario_liquido);
        
        in.close();
    }
}
