import java.util.Scanner;
public class Ex4{
    /*
        Escrever um algoritmo que calcule os sucessivos valores de E usando a série abaixo
        e considerando que ovalor de n deve ser fornecido pelo usuário.
        E= 1+ 1/1! + 1/2! ... 1/n!

        n = 2
        E = 1+ 1/1 + 1/2
        1+1+0.5=2.5

        n = 3
        E = 1+ 1/1 + 1/2! + 1/6
        1+1+0.5+0.16=2.5

    */
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        float E=1.0f;
        for(int i=1;i<=n;i++){
            int factorial=1;
            for(int j=1;j<=i;j++){
                factorial*=j;
            }
            E += 1.0f/(float)factorial;
        }
        System.out.printf("E:%.2f\n",E);
        in.close();
    }
}