import java.util.Scanner;
public class Ex9 {
    public static void main(String[] args){
        /* 
            Escreva um programa que pergunte o raio de uma circunferência, e sem seguida
            mostre o diâmetro, comprimento e área da circunferência. Considere PI = 3.141692
        */
        Scanner in=new Scanner(System.in);
        System.out.println("Digite o raio da circuferencia");
        float PI=3.141692f;
        float raio_circ=in.nextFloat();
        float diametro=2*raio_circ;
        float area= raio_circ*raio_circ*PI;
        System.out.printf("Diametro:%.2f\nArea:%.2f\n",diametro,area);
        in.close();
    }
}
