import java.util.Scanner;
public class Ex5{
    /*
        Implementar um algoritmo para calcular o valor de ex. O valor de X deverá ser
        digitado. O valor de exserá calculado pela soma dos 10 primeiros termos da série a
        seguir

        e^x = x+ (x²)/2! + x³/3! + ... (x^10)/10!

        x=2
            
                2+
                (2**2)/2+
                (2**3)/6+
                (2**4)/24+
                (2**5)/120+
                (2**6)/720+
                (2**7)/5040+
                (2**8)/40320+
                (2**9)/362880+
                (2**10)/3628800

        x=3
                3+
                (3**2)/2+
                (3**3)/6+
                (3**4)/24+
                (3**5)/120+
                (3**6)/720+
                (3**7)/5040+
                (3**8)/40320+
                (3**9)/362880+
                (3**10)/3628800
        x=4
                4+
                (4**2)/2+
                (4**3)/6+
                (4**4)/24+
                (4**5)/120+
                (4**6)/720+
                (4**7)/5040+
                (4**8)/40320+
                (4**9)/362880+
                (4**10)/3628800

    */
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        int x=in.nextInt();
        int limite_interador=10;
        float eElevadox=x;
        for(int i=2;i<=limite_interador+2;i++){
            int factorial=1;
            for(int j=1;j<=i;j++){
                factorial*=j;
            }
            int potencia=1;
            for(int k=1;k<=i;k++){
                potencia*=x;
            }
            eElevadox+=(float)potencia/(float)factorial;
        }
        System.out.printf("e^x:%f\n",eElevadox);
        in.close();
    }
}