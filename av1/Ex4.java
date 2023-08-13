import java.util.Scanner;
public class Ex4 {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int n_interacao=in.nextInt();
        double numerador=1.0;
        double denominador=1.0;
        double somatorio=0.0;        
        for(int i=1;i<=n_interacao;i++){
            double div=(numerador/denominador);
            if(i % 2 ==0){
                somatorio-=div;
            } else{
                somatorio+=div;
            }
            denominador+=2.0;
        }
        double aprox_pi=4*somatorio;
        System.out.println(aprox_pi);
        in.close();
    }
}
