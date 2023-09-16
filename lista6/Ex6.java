import java.util.Scanner;
public class Ex6{
    /*
        Faça um programa que peça um número inteiro e imprima a série de Fibonacci,
        sendo o limite este número. Os números de Fibonacci é uma sequência de números
        naturais, na qual os primeiros dois termos são 0 e 1, e cada termo subsequente
        corresponde à soma dos dois precedentes. Por Exemplo: 0, 1, 1, 2, 3, 5, 8, 13,
        21,34, 55, 89, 144, 
    */
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int n = in.nextInt();
        
        while(n<0){
            System.out.println("N é negativo.Digite novamente");
            n = in.nextInt();
        }
        String seq="0,1";
        int anterior1=0;
        int anterior2=1;
        int limite=n;
        if(n>1){
            while(limite<=n){
                int proximo_numero=anterior1+anterior2;
                if(proximo_numero>n){
                    break;
                }
                seq+=",";
                limite=proximo_numero;
                seq+=""+proximo_numero;
                anterior1=anterior2;
                anterior2=limite;
            }
        } else{
            if (n==0){
                seq="0";
            } else{
                seq="0,1,1";
            }
        }
        
        System.out.println(seq);
        in.close();
    }
}

