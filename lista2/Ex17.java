import java.util.Scanner;
public class Ex17 {
    /*
        O custo de um carro novo ao consumidor é a soma do custo de fábrica com a
        porcentagem do distribuidor e dos impostos (aplicados ao custo de fábrica).
        Supondo que o percentual do distribuidor seja de 28% e os impostos de 45%,
        escrever um algoritmo para ler o custo de fábrica de um carro, calcular e escrever o
        custo final ao consumidor.

    */   
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        float custo_fabri=in.nextFloat();
        float perc_distribuidor=0.28f;
        float perc_imposto=0.45f;
        float custo_total=custo_fabri+(custo_fabri*perc_distribuidor)+(custo_fabri*perc_imposto);
        System.out.printf("Custo_total:%.2f\n",custo_total);
        in.close();
    }
}
