public class Ex29 {
    /*
        HARD - Escreva um programa que conte de 100 a 999 (inclusive) e exiba, um por
        linha, o produto dos três dıgitos dos números.
        a. Desafio 1 - Faça seu programa dar uma pausa a cada 20 linhas para que
        seja possível ver todos os números pouco a pouco. Solicite que seja
        pressionada alguma tecla para ver a próxima sequência de números.Por
        exemplo, inicialmente o programa irá exibir:
        100 (1*0*0)
        101 (1*0*1)
        102 (1*0*2)
        (...)
        110 (1*1*0)
        111 (1*1*1)
        112 (1*1*2)
        999 (9*9*9) = 729
    */
    public static void main(String[] args){
        for(int i=100;i<=999;i++){
            String numero_string=i+"";
            char centena=numero_string.charAt(0);
            char dezena=numero_string.charAt(1);
            char unidade=numero_string.charAt(2);
            int  multiplicacao= Integer.parseInt(String.valueOf(centena))*Integer.parseInt(String.valueOf(dezena))*Integer.parseInt(String.valueOf(unidade));
            System.out.printf("%s (%c * %c * %c) = %d\n",numero_string,centena,dezena,unidade,multiplicacao);
            if(i-100%20==0){
                System.out.println("(...)");
                for(int s=0;s<=5000000;s++){};
            }            
        }
    }
}
