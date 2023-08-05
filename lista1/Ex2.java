import java.util.Scanner;
public class Ex2 {
    public static void main(String[] args){
        System.out.println("Digite um numero real");
        Scanner in = new Scanner(System.in);
        double n=in.nextDouble();
        double n2= n*20/100;
        System.out.println("Saida");
        System.out.println(n+n2);
        in.close();
    }
}
