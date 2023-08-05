import java.util.Scanner;
public class Ex2 {
    public static void main(String[] args){
        Scanner in =new Scanner(System.in);
        System.out.println("Digite o número de lados de um poligono");
        int l=in.nextInt();
        System.out.println("Digite a medida do lado em cm");
        float medida=in.nextInt();
        switch(l){
            case 3:
                System.out.println("TRIÂNGULO");
                float perimetro=3*medida;
                System.out.println("Perimetro");
                System.out.println(perimetro);
                break;
            case 4:
                System.out.println("QUADRADO");
                float area=l*l;
                System.out.println("ÁREA");
                System.out.println(area);
                break;
            case 5:
                System.out.println("PENTÁGONO");
                break;
            default:
                if(l>3){
                    System.out.println("FIGURA DESCONHECIDA");  
                }
                break;
        }
        in.close();
    }
}
