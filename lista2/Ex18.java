import java.util.Scanner;
public class Ex18 {
    /*
        Uma revendedora de carros usados paga a seus funcionários vendedores um salário
        fixo por mês, mais uma comissão também fixa para cada carro vendido e mais 5%
        do valor das vendas por ele efetuadas. Escrever um algoritmo que leia o número de
        carros por ele vendidos, o valor total de suas vendas, o salário fixo e o valor que ele
        recebe por carro vendido. Calcule e escreva o salário final do vendedor.

        Exemplo
        n_carros=10
        valor_total_vendas=12000.00
        salario_fixo=3000.00
        comissao=50.00
        (50*10)+3000+ 12000 * 0.05
    */
    public static void main(String[] agrs){
        Scanner in=new Scanner(System.in);
        int n_carros=in.nextInt();
        float valor_total_vendas=in.nextFloat();
        float salario_fixo=in.nextFloat();
        float comissao_carro=in.nextFloat();
        float salario=salario_fixo+(comissao_carro*n_carros)+(valor_total_vendas*0.05f);
        System.out.printf("Salario Total:%.2f\n",salario);
        in.close();
    }
}
