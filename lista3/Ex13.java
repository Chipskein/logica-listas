import java.util.Scanner;
public class Ex13 {
    /*
        Faça um algoritmo para ler: 
            a descrição do produto (nome), 
            a quantidade adquirida e 
            o preço unitário. 
        Calcular e escrever o total (total = quantidade adquirida * preço
        unitário), o desconto e o total a pagar (total a pagar = total - desconto), sabendo-se
        que:
        - Se quantidade <= 5 o desconto será de 2%
        - Se quantidade > 5 e quantidade <=10 o desconto será de 3%
        - Se quantidade > 10 o desconto será de 5 
    */
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        String nome_produto=in.nextLine();
        int quantidade_adquiridade=in.nextInt();
        float preco_unitario=in.nextFloat();
        float total=quantidade_adquiridade*preco_unitario;
        float desconto=0.0f;
        if(quantidade_adquiridade<=5){
            desconto=total*0.02f;
        }
        if(quantidade_adquiridade>5&&quantidade_adquiridade<=10){
            desconto=total*0.03f;
        }
        if(quantidade_adquiridade>10){
            desconto=total*0.05f;
        }
        float total_a_pagar=total-desconto;
        System.out.printf("Nome:%s\nTotal:%.2f\nDesconto:%.2f\nTotal a pagar:%.2f\n",nome_produto,total,desconto,total_a_pagar);
        in.close();
    }   
}
