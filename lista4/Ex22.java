import java.util.Scanner;
public class Ex22 {
    /*
        Dado um país A, com X habitantes e uma taxa de natalidade de 3% ao ano, e um
        país B com Y habitantes e uma taxa de natalidade de 2% ao ano, escrever um
        algoritmo em JAva que seja capaz de calcular e no fim imprimir o tempo necessário
        para que a população do país A ultrapasse a população do país B. Considere que X
        < Y.
        Pais A X habitantes 0.03f ao ano
        Pais B Y habitantes 0.02f ao ano
        Considere Y>X
    */
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int habitantes_A=in.nextInt();
        int habitantes_B=in.nextInt();
        float tx_cres_A=0.03f;
        float tx_cres_B=0.02f;
        int n_ano=0;
        while(habitantes_B>=habitantes_A){
            n_ano++;
            habitantes_A+=(int)Math.ceil(habitantes_A*tx_cres_A);
            habitantes_B+=(int)Math.ceil(habitantes_B*tx_cres_B);
            System.out.printf("Ano:%d\nHabitantes Pais A:%d\nHabitantes Pais B:%d\n",n_ano,habitantes_A,habitantes_B);
        }
        System.out.println(n_ano);
        in.close();
    }
}
