import java.util.Scanner;
class Ex1{
    public static void main(String[] args){
        System.out.println("");
        Scanner in = new Scanner(System.in);
        System.out.println("Digite um número");
        int n = in.nextInt();
        System.out.println("Antecessor:");
        System.out.println(n-1);
        in.close();
    }
}