import java.util.Scanner;
public class Ex20 {
    /*
    Um motorista de táxi deseja calcular o rendimento de seu carro na praça.
    
        Sabendo-se que o preço do combustível é de R$ 4.599, 
    escreva um algoritmo para
    ler: 
        a marcação do odômetro (Km) no início do dia, 
        a marcação (Km) no final do dia,
        o número de litros de combustível gasto e o 
        valor total (R$) recebido dos passageiros. 
    Calcular e escrever: a média do consumo em Km/L e o lucro (líquido)
    do dia.
    */
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        float preco_combustivel=4.599f;
        float odometro_inicio=in.nextFloat();
        float odometro_fim=in.nextFloat();
        int n_litros=in.nextInt();
        float valor_total_passageiros=in.nextFloat();
        float km_rodados=odometro_fim-odometro_inicio;
        float consumo=km_rodados/n_litros;
        float lucro=valor_total_passageiros-(n_litros*preco_combustivel);
        System.out.printf("Consumo:%.2f\nLucro:%.2f",consumo,lucro);
        in.close();
    }    
}
