import java.util.Scanner;
import java.lang.Math;
class Ex1 {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        System.out.println("Digite o comprimento(metros):");
        float comprimento=scan.nextFloat();
        System.out.println("Digite a largura(metros):");
        float largura=scan.nextFloat();
        System.out.println("Digite a altura(metros):");
        float altura=scan.nextFloat();
        float area_total_cozinha = 4*(altura*largura)+2*(comprimento*largura);
        System.out.println("Número de caixas necessárias");
        double qt_caixas = Math.ceil(area_total_cozinha/1.5f);
        System.out.println(qt_caixas);
        scan.close();
    }
}