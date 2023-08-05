import java.util.Scanner;
public class Ex5 {
    public static void main(String[] args){

        Scanner in= new Scanner(System.in);
        System.out.println("Digite um grau Celsiu");
        double c=in.nextDouble();
        double f=(9*c+160)/5;
        System.out.println("Fahrenheit");
        System.out.println(f);
        in.close();
    }
}
