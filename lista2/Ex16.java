import java.util.Scanner;
public class Ex16 {
    /* 
        Uma empresa abriu uma linha de crédito para os funcionários. O valor da prestação
        não pode ultrapassar 30% do salário. Faça um programa que receba o salário, o
        valor do empréstimo e o número de prestações e informe se o empréstimo pode ser
        concedido. 
        Nenhum dos valores informados pode ser zero ou negativo.
    */
    public static void main(String[] args){
        Scanner in= new Scanner(System.in);
        float salario=in.nextFloat();
        float emprestimo=in.nextFloat();
        float n_prestacao=in.nextInt();
        if(salario>0&&emprestimo>0&&n_prestacao>0){
            float max_prestacao=0.3f*salario;
            float valor_prestacao=emprestimo/n_prestacao;
            String status;
            if(valor_prestacao>max_prestacao){
                status="Recusado";
            } else{
                status="Aprovado";
            }
            System.out.printf("Status do pedido:%s\n",status);
        }  else {
            System.out.printf("Inputs Inválidos\n");
        }
        in.close();
    }
}
