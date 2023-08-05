import java.util.Scanner;
public class Ex4 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Digite a base do triangulo");
        double base=in.nextDouble();
        System.out.println("Digite a altura do triangulo");
        double altura=in.nextDouble();
        System.out.println("Area do triangulo");
        double area=(base*altura)/2;
        System.out.println(area);
        in.close();
    }
}
