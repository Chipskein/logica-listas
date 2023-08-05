import java.util.Scanner;
public class Ex10 {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);

        System.out.println("Digite o valor do ingresso");
        float vi=in.nextFloat();

        System.out.println("Digite o numero de socios");
        int n_socios=in.nextInt();

        System.out.println("Digite o número de pessoas não pagantes");
        int n_n_pagantes=in.nextInt();

        System.out.println("Digite o número de pagantes");
        int n_pagantes=in.nextInt();
        
        float renda_total=((vi*30/100)*n_socios)+(vi*n_pagantes);
        float total_s_desc_isenc=vi*(n_n_pagantes+n_pagantes+n_socios);
        System.out.println("Renda total:");
        System.out.println(renda_total);
        System.out.println("Total sem descontos e isenções:");
        System.out.println(total_s_desc_isenc);
        in.close();
    }
}
