import java.util.Scanner;
public class Ex19 {
    /*
        Escreva um algoritmo para ler as dimensões de uma cozinha retangular
        (comprimento, largura e altura), calcular e 
        escrever a quantidade de caixas de azulejos para se colocar em todas as suas paredes (considere que não será
        descontada a área ocupada por portas e janelas). 
        Cada caixa de azulejos possui 1.5
        m2 .
    */
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        float comprimento=in.nextFloat();
        float largura=in.nextFloat();
        float altura=in.nextFloat();
        float qt_area_cobrida_caixa_azulejos=1.5f;
        float area_faces=4*comprimento*largura;
        float area_bases=2*largura*altura;
        float area_total=area_bases+area_faces;
        int qt_caixas = (int) Math.ceil(area_total/qt_area_cobrida_caixa_azulejos);
        System.out.printf("Quantidade de caixas:%d\n",qt_caixas);
        in.close();
    }
}
