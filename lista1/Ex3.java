import java.util.Scanner;
public class Ex3 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Digite um numero");
        int n=in.nextInt();
        System.out.println("Quadrado");
        int q=(n*n);
        System.out.println(q);
        in.close();
    }
}
