import java.util.Scanner;
public class Ex2{
    /*
        Fatores Primos - Desenvolva o código necessário para fazer a decomposição em
        fatores primos. Lembrando que um número é considerado primo quando possui
        apenas dois divisores, 1 e ele mesmo, por exemplo, o número 17 é primo pois
        nenhum número entre 2 e 16 tem resto 0 quando tentamos dividir o número 17. O
        número decomposto em fatores primos nada mais é do que reescrever o número
        como uma sequência de multiplicações onde todos os valore são primos, por
        exemplo:
        225 = 3 * 3 * 5 * 5
        1001 = 7 * 11 * 13
        Neste exercício, você irá solicitar ao usuário um número positivo e maior que 1 e,
        apresentará sua decomposição em fatores primos, mostrando um valor primo por linha,
        valores repetidos aparecerão um ao lado do outro, por exemplo
    */
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        System.out.println("Informe o numero a ser decomposto");
        int numero=in.nextInt();
        int divisor=2;
        String output="";
        Boolean isFirstTime=true;
        while(divisor<=numero){
            if (numero % divisor ==0 ){
                if(isFirstTime){
                    output+="\n";    
                    isFirstTime=false;
                }
                numero/=divisor;
                output+=""+divisor+" ";
            } else{
                divisor++;
                isFirstTime=true;
            }
        }
        System.out.print(output);
        in.close();
    }
}