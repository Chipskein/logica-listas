import java.util.Scanner;
public class Ex7 {
    public static void main(String[] args){

        Scanner in= new Scanner(System.in);
        System.out.println("Distancia em metros");
        double d=in.nextDouble();
        System.out.println("Velocidade Média(m/s)");
        double vm=in.nextDouble();
        double t=d/vm;
        System.out.println("Tempo em segundos");
        System.out.println(t);
        in.close();
    }
}
