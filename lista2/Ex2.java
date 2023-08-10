import java.util.Scanner;
public class Ex2 {
    /*
       Escreva um algoritmo para ler as dimensões de um 
       retângulo (base e altura), 
       calcular e escrever a área e o perímetro do retângulo
     */
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Digite o valor da base em centimetros:");
        float base = in.nextFloat();
        System.out.println("Digite o valor da altura em centimetros:");
        float altura=in.nextFloat();
        float area=base*altura;
        float perimetro=2*base+2*altura;
        System.out.printf("Área:%f\n",area);
        System.out.printf("Perimetro:%f\n",perimetro);
        in.close();
    }
}
