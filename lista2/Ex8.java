import java.util.Scanner;
public class Ex8 {
    /*
        Escreva um algoritmo para ler o 
            número total de eleitores de um município, o
            número de votos brancos, 
            nulos e 
            válidos. 
        Calcular e escrever o percentual que cada um representa em relação ao total de eleitores
    */
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        
        System.out.println("Digite o total numero de eleitores do municipio");
        int numero_total_eleitores=in.nextInt();
        
        /*Dava pra validar sa porra aqui mas eu não vou */
        System.out.println("Digite o total numero de votos brancos do municipio");
        int votos_brancos=in.nextInt();
        
        System.out.println("Digite o total numero de votos nulos do municipio");
        int votos_nulos=in.nextInt();
        
        System.out.println("Digite o total numero de votos válidos do municipio");
        int votos_validos=in.nextInt();



        float percentual_votos_brancos=votos_brancos*100/numero_total_eleitores;
        float percentual_votos_nulos=votos_nulos*100/numero_total_eleitores;
        float percentual_votos_validos=votos_validos*100/numero_total_eleitores;

        System.out.printf("Votos Brancos:%.2f\n",percentual_votos_brancos);
        System.out.printf("Votos Nulos:%.2f\n",percentual_votos_nulos);
        System.out.printf("Votos Validos:%.2f\n",percentual_votos_validos);

        in.close();

    }
}
