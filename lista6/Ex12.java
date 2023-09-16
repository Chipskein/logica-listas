public class Ex12 {
    /*
        Um número perfeito é aquele cuja soma de seus divisores é igual ao próprio número.
        Por exemplo, o número 6 que possui como divisores 1, 2, 3, e como 1+2+3=6. 6 é
        um número perfeito. Desenvolva um programa que calcule os números perfeitos no
        intervalo de 0 a 1000.
    */
    public static void main(String[] args){
        final int NUMERO_MAX=1000;
        int numero_counter=1;
        while(numero_counter<=NUMERO_MAX){
            int n=numero_counter;   
            int counter=1;
            int soma_divisores=0;
            while(counter<n){
                if(n % counter==0){
                    soma_divisores+=counter;
                }
                counter++;
            }
            boolean eh_perfeito=soma_divisores==n;
            if(eh_perfeito){
                System.out.println(n);
            }
            numero_counter++;
        }
    }
}
