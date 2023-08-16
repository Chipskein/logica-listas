import java.util.Scanner;
public class Ex23 {
    /*
        Na usina de Angra dos Reis, os técnicos analisam a perda de massa de um material
        radioativo. Sabendo-se que este perde 25% de sua massa a cada 30 segundos.
        Escrever um algoritmo em Java que calcule iterativamente e imprima o tempo
        necessário para que a massa deste material se torne menor que 0,10 grama 
    */
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        float massa = in.nextFloat();
        int segundos = 0;
        float tx_perda_per_30s = 0.25f;
        while(massa<=0.10f){
            System.out.println("Massa Invalida");
            massa=in.nextFloat();
        }
        while(massa>=0.10f){
            segundos+=30;
            massa-=(massa*tx_perda_per_30s);
            System.out.printf("Massa(g):%.2f\nTempo(s):%d\n",massa,segundos);
        }
        System.out.println(segundos);
        in.close();
    }
}
