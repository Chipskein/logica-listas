import java.util.Scanner;
public class Ex21 {
    /*
        A equipe Red Bull Racing de Fórmula 1 deseja calcular o número mínimo de litros
        que deverá colocar no tanque de seu carro para que ele possa percorrer um
        determinado número de voltas até o primeiro reabastecimento. Escreva um
        algoritmo que leia 
            o comprimento da pista (em metros), 
            100 
            o número total de voltas a serem percorridas no grande prêmio, 
            10
            o número de reabastecimentos desejados e
            2
            o consumo de combustível do carro (em Km/L). 
            10
         
        distancia_total=comprimento*n_voltas
        combustivel_total=distancia_total/consumo
        combustivel_minimo=combustivel_total/n_reabestecimentos
        

        Calcular e escrever o número mínimo de litros necessários para percorrer até o primeiro reabastecimento. 
        Observação:
            Considere que o número de voltas entre os reabastecimentos é o mesmo.
    
    */   
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        float comprimento_pista =in.nextFloat();
        int n_voltas = in.nextInt();
        int n_reabestecimentos = in.nextInt();
        float consumo = in.nextFloat();
        float distancia_total=comprimento_pista*n_voltas;
        float combustivel_total=distancia_total/consumo;
        float combustivel_minimo=combustivel_total/n_reabestecimentos;
        System.out.printf("Combustivel minimo %.2f",combustivel_minimo);
        in.close();
    }
}
