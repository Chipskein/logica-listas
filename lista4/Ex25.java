import java.util.Scanner;
public class Ex25 {
    /*
         Escreva um algoritmo em Java que receba vários números e verifique se eles são ou
        não quadrados perfeitos. O algoritmo termina a execução quando for digitado um
        número menor ou igual a 0. (Um número é quadrado perfeito quando tem um
        número inteiro como raiz quadrada.). Obs: não deve ser utilizado métodos da classe
        Math.
    */
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int numero=1;
        while(numero>0){
            numero=in.nextInt();
            boolean eh_quadrado=false;
            for(int i=1;i<=numero;i++){
                int n=i*i;
                if(n==numero){
                    eh_quadrado=true;
                    break;
                }
            }
            System.out.printf("Numero:%d\nQuadrado:%b\n",numero,eh_quadrado);
        }
        in.close();
    }
}
