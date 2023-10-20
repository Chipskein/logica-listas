import java.util.Scanner;
public class Ex5{
    /*
        A fim de entender o crescimento populacional de diversos países, cientistas do IFRS
        solicitaram que você criasse um programa que recebesse 4 valores. Referentes ao
        tamanho da população e a taxa de crescimento anual. Para cada caso, indique em
        quantos anos a população de um país ultrapassará a de outro. Execute dentro de
        um laço de repetição até que sejam digitados os valores 0 para a população do país.
        Se atente para o caso em que um país nunca ultrapassará o outro.
    */
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        while(true){
          System.out.println("Informe a população e taxa de crescimento do primeiro pais");
          int pop_A=in.nextInt();
          float tx_cres_A=in.nextFloat();
          float pop_A_f=(float) pop_A;
          System.out.println("Informe a população e taxa de crescimento do segundo pais");
          int pop_B=in.nextInt();
          float pop_B_f=(float) pop_B;
          float tx_cres_B=in.nextFloat();
          if(pop_A==0||pop_B==0){
            break;
          }
          Boolean ehImpossivel= tx_cres_A >=tx_cres_B;
          if(!ehImpossivel){
            int anos=0;
            while (pop_A_f>=pop_B_f){
              anos++;
              pop_A_f= pop_A_f + (pop_A_f*(tx_cres_A/100)) ;
              pop_B_f= pop_B_f + (pop_B_f*(tx_cres_B/100)) ;
            }
            System.out.printf("Em %d anos o tamanha da população do segundo país ultrapassará a do primeiro\n",anos);
          } else{
            System.out.printf("O segundo país não ultrapassará o primeiro\n");
          }
        }
        in.close();
    }
}
