import java.util.Scanner;
public class Ex6 {
    public static void main(String[] args){
        Scanner in= new Scanner(System.in);
        System.out.println("Digite nota1");
        double n=in.nextDouble();
        System.out.println("Digite nota2");
        double n2=in.nextDouble();
        double avg=(n+n2)/2;
        System.out.println("media");
        System.out.println(avg);
        in.close();
    }
}
