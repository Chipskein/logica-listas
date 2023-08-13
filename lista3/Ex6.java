import java.util.Scanner;
public class Ex6 {
    /*
        Ler o nome de dois times e o número de gols marcados na partida (para cada time).
        Escrever o nome do vencedor. Caso não haja vencedor deverá ser impressa a
        palavra EMPATE. 
    */
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        String t1=in.next();
        String t2=in.next();
        int g1=in.nextInt();
        int g2=in.nextInt();
        while(g1<0||g2<0){
            System.out.println("Digite os gols novamente");
            g1=in.nextInt();
            g2=in.nextInt();
        }
        String msg="";
        if(g1==g2){
            msg="Empate";
        }
        if(g1>g2){
            msg=t1;
        }
        if(g2>g1){
            msg=t2;
        }
        System.out.println(msg);
        in.close();
    }
}
