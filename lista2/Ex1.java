import java.util.Scanner;

class Ex1{
    public static void main(String[] args){
        /*
         Faça um algoritmo que converta metros para centímetros.
          Lembrando que 1m = 100cm
         */
        Scanner in=new Scanner(System.in);
        System.out.println("Digite metro");
        float metro = in.nextFloat();
        float centrimetro=metro*100;
        System.out.printf("Metro :%f\n",metro);
        System.out.printf("Centimetro:%f\n",centrimetro);
        in.close();
    }
}
