import java.util.Scanner;
public class Ex19 {
    /* 
        Faça um programa que mostre n primeiros valores da sequência de Fibonacci, a
        sequência é feita da seguinte maneira: 1 1 2 3 5 8 13 21 34 55 …
    */
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        while(n<=0){
            System.out.println("n invalido");
            n=in.nextInt();
        }
        int anterior1=1;
        int anterior2=1;
        String sequencia="";
        for(int i=1;i<=n;i++){
            if(i>2){
                int numero_sequecia=anterior1+anterior2;
                anterior2=anterior1;
                anterior1=numero_sequecia;
                sequencia+=numero_sequecia+",";
            } else{
                sequencia+=1+",";
            }
        }
        System.out.printf("Sequencia:%s\n",n,sequencia);
        in.close();
    }
}
