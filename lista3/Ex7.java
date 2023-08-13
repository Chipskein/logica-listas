import java.util.Scanner;
public class Ex7 {
    /*
        Um posto está vendendo combustíveis com a seguinte tabela de descontos:

        -Alcool até 20 litros 3% desconto por litro
        -Alcool acima 20 litros 5% desconto por litro

        -gasolina até 20 litros 4% desconto por litro
        -gasolina acima 20 litros 6% desconto por litro

        Escreva um algoritmo que leia o número de litros vendidos e o tipo de combustível
        (codificado da seguinte forma: A-álcool, G-gasolina), 
        calcule e imprima o valor a ser pago pelo cliente 
        sabendo-se que o preço do litro da gasolina é R$ 4.30 e o preço do
        litro do álcool é R$ 3.90 
    */
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        float preco_gasolina=4.30f;
        float preco_alcool=3.90f;
        float total=0.0f;
        String gasolina="A-alcool";
        String alcool="G-gasolina";
        int litros=in.nextInt();
        while(litros<0){
            System.out.println("Litros negativos");
            litros=in.nextInt();
        }
        String tipo_combustivel=in.next();
        while(!tipo_combustivel.equals(gasolina)&&!tipo_combustivel.equals(alcool)){
            System.out.println("Tipo de combustivel invalido");
            tipo_combustivel=in.next();
        }
        if(!tipo_combustivel.equals(gasolina)){
            if(litros<=20){
                total=litros*(preco_gasolina-preco_gasolina*0.04f);        
            } else{
                total=litros*(preco_gasolina-preco_gasolina*0.06f);
            }
        } else{
            if(litros<=20){
                total=litros*(preco_alcool-preco_alcool*0.03f);        
            } else{
                total=litros*(preco_alcool-preco_alcool*0.05f);
            }
        }
        System.out.println(total);
        in.close();
    }
}
