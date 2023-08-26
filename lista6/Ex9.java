import java.util.Scanner;
public class Ex9 {
    /*
        O número 3025 possui a seguinte característica: 30 + 25 = 55 e 55² = 3025. Fazer
        um algoritmo para um programa que pesquise e imprima todos os números de
        quatro algarismos que apresentam tal característica.
    */
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int numero=in.nextInt();
        String numero_str=numero+"";
        char milhar=numero_str.charAt(0);
        char centena=numero_str.charAt(1);
        char dezena=numero_str.charAt(2);
        char unidade=numero_str.charAt(3);
        String milhar_centena_str=(milhar+""+centena);
        int milhar_centena=Integer.parseInt(milhar_centena_str);
        String dezena_unidade_str=(dezena+""+unidade);
        int dezena_unidade=Integer.parseInt(dezena_unidade_str);
        int soma=milhar_centena+dezena_unidade;
        int soma_quadrado=soma*soma;
        boolean numero_tem_caracteristica= soma_quadrado==numero;
        if(numero_tem_caracteristica){
            System.out.printf("(%d+%d)=%d %d²=%d %d=%d\n",milhar_centena,dezena_unidade,soma,soma,soma_quadrado,soma_quadrado,numero);
        } else{
            System.out.printf("(%d+%d)=%d %d²=%d %d!=%d\n",milhar_centena,dezena_unidade,soma,soma,soma_quadrado,soma_quadrado,numero);
        }
        
        in.close();
    }    
}

