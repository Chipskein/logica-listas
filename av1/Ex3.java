import java.util.Scanner;
class Ex3{
    /*
        (Peso 2,0) Laços - Faça um programa que leia 20 valores e informe quantos deles
        
        são pares, 
        quantos são ímpares, 
        quantos são múltiplos 3,
        qual o maior valor e qual o
        menor valor. 
        Atenção: caso seja digitado um valor negativo, o programa deve pedir
        novamente um valor, isto é, todos os valores aceitos devem ser maiores ou iguais a
        zero.
    */
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int max=0;
        int min=0;
        int c_pares=0;
        int c_impares=0;
        int c_multiplo3=0;

        for (int c=1;c<=20;c++){
            int numero=in.nextInt();
            if(numero<0){ 
                System.out.println("Digita positivo ai mermao");
                c--;
                continue;
            }
            
            if(c==1){
               min=numero;
            }
            
            if(numero % 2==0){
                c_pares++;
            } else{
                c_impares++;
            }

            if( numero%3==0){
                c_multiplo3++;
            }

            if(numero>=max){
                max=numero;
            }
            
            if(numero<=min){
                min=numero;
            }
        }
        System.out.printf("Pares:%d\nImpares:%d\nMultiplo de 3:%d\n max:%d\n min:%d\n", c_pares,c_impares,c_multiplo3,max,min);
        in.close();
    }   
}
