import java.util.Scanner;
public class Ex9 { 
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        System.out.println("Digite a Quantidade de homens no churrasco:");
        int h=in.nextInt();
        System.out.println("Digite a Quantidade de mulheres no churrasco:");
        int m=in.nextInt();
        System.out.println("Digite a Quantidade de crianças no churrasco:");
        int c=in.nextInt();
        System.out.println("Quantidade em gramas de carne bovina necessária:");
        float carne_qt=h*400+m*320+c*200;
        float margem_seguranca=(carne_qt*20)/100;
        float total_carne=carne_qt+margem_seguranca;
        System.out.println(total_carne);
        in.close();
    }
}
