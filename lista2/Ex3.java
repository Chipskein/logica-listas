import java.util.Scanner;
public class Ex3 {
    /*
       Ler um valor e escrever se é positivo ou negativo (considere o valor zero como
        positivo).
     */
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Digite um número ai:");
        int numero = in.nextInt();
        if(numero==0){
            System.out.println("zero");
        }
        else{
            if(numero>0){
                System.out.println("positivo");
            }
            else{
                System.out.println("negativo");
            }
        }
        in.close();
    }
}
